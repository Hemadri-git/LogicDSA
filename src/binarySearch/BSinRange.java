package binarySearch;

public class BSinRange
{
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,7,8,12,13};
        int target = 7;

        int index = binarySearch(arr, target);
        if (index != -1){
            System.out.println("Element found at: " + index);
        }
        else {
            System.out.println("Not Found");
        }
    }

    private static int binarySearch(int[] arr, int target) {

        int low = 3;
        int high = 6;

        while (low<=high){
            int mid = low +( high - low)/ 2;

            if (target == arr[mid]){
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
