import java.util.Arrays;

// In Java 21+, you don't strictly need the "public class" wrapper,
// but you can include it if your IDE complains about unnamed classes.
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
            // Simplified using a ternary operator
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    // Java 21+ allows this simplified main method (Preview feature in some versions)
    // If this still fails, revert to: public static void main(String[] args)
    public static void main() {
        int[] nums1 = {3, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Majority Element: " + majorityElement(nums1)); // Output: 3

        System.out.println();

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Majority Element: " + majorityElement(nums2)); // Output: 2
    }
}