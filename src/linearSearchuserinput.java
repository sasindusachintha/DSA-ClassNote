
import java.util.Scanner;

public class linearSearchuserinput {

    public static int linear(int[] arr, int key) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            count++;
            if (arr[i] == key) {
                System.out.println("Total counts: " + count);
                return i;
            }
        }
        System.out.println("Total counts: " + count);
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};

        Scanner sc = new Scanner(System.in);

        int key;

        System.out.print("Enter key to search: ");
        key = sc.nextInt();

        int index = linear(arr, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found!");
        }

    }
}
