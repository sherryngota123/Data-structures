public class Main {

    // Binary Search Method
    public static int BinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int midpoint = (start + end) / 2;

            // Check if the target is at the mid
            if (nums[midpoint] == target) {
                return midpoint;
            }

            // If target is greater, ignore the left half
            if (nums[midpoint] < target) {
                start = midpoint + 1;
            }
            // If target is smaller, ignore the right half
            else {
                end = midpoint - 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }

    // Main method to test the binary search
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};  // Corrected array declaration
        int target = 0;
        System.out.println("Output: " + BinarySearch(nums, target));  // Calling the BinarySearch method
    }
}