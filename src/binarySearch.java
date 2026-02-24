
public class binarySearch {

    public static int BinarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void insertion(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 45, 23, 56, 78, 23, 43};

        //unsorted array
        System.out.print("Unsorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        //sorted array
        System.out.print("Sorted Array: ");
        insertion(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        int key = 34;

        int index = BinarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found!");
        }
    }
}
