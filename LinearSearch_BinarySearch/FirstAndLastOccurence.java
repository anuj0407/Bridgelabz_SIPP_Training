package linearSearchAndBinarySearch;

public class FirstAndLastOccurence {

    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return first;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 5, 6, 7};
        int target = 4;

        int first = findFirstOccurrence(nums, target);
        int last = findLastOccurrence(nums, target);

        if (first == -1 || last == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        }
    }
}