import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

void main() {
    int[] nums1 = {16, 17, 4, 3, 5, 2};
    System.out.println("Input: " + Arrays.toString(nums1));
    System.out.println("Leaders: " + leaders(nums1)); // [17, 5, 2]

    System.out.println();

    int[] nums2 = {1, 2, 3, 4, 0};
    System.out.println("Input: " + Arrays.toString(nums2));
    System.out.println("Leaders: " + leaders(nums2)); // [4, 0]

    System.out.println();

    int[] nums3 = {7, 10, 4, 10, 6, 5, 2};
    System.out.println("Input: " + Arrays.toString(nums3));
    System.out.println("Leaders: " + leaders(nums3)); // [10, 6, 5, 2]
}

// A leader is greater than every element to its right (rightmost is always a leader).
// Time: O(n) | Space: O(1) excluding the result list.
List<Integer> leaders(int[] nums) {
    List<Integer> result = new ArrayList<>();
    if (nums == null || nums.length == 0) return result;

    int maxFromRight = Integer.MIN_VALUE;
    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] > maxFromRight) {
            result.add(nums[i]);
            maxFromRight = nums[i];
        }
    }

    Collections.reverse(result);
    return result;
}
