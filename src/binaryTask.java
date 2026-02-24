import java.util.Scanner;

public class binaryTask {

    public static int binary(String[] names, String key) {
        int low = 0, high = names.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (names[mid].equalsIgnoreCase(key)) {
                return mid;
            } else if (names[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareToIgnoreCase(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] fruits = new String[3];

        Scanner sc = new Scanner(System.in);
         for (int i = 0; i < 3; i++) {
          System.out.print("Enter fruit " + (i + 1) + " : ");
           fruits[i] = sc.nextLine();
         }
       
        
        //unsorted array
        System.out.print("Unsorted Array: ");
        for (String x : fruits) {
            System.out.print(x + " ");
        }

        System.out.println();

        //sorted array
        System.out.print("Sorted Array: ");
        bubbleSort(fruits);
        for (String x : fruits) {
            System.out.print(x + " ");
        }

        System.out.println();

       System.out.println("Enter name to Search:");
       String key = sc.nextLine();
        int index = binary(fruits, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found!");
        }
    }
}

