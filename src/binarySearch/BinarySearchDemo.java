package binarySearch;

public class BinarySearchDemo
{

    public static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 6;

        int result = search(arr, target);
        if (result != -1){
            System.out.println("Element found at: " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
