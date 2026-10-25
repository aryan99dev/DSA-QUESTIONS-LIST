import java.util.Arrays;

public class Majority_Element1_Arrays {

    /**
     * Finds the majority element in an array (an element that appears more than floor(n / 2) times).
     *
     * Algorithm: Boyer-Moore Voting Algorithm
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Majority Element: " + majorityElement(nums1)); // Output: 3

        System.out.println();

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Majority Element: " + majorityElement(nums2)); // Output: 2
    }
}
