
public class largestSmallest {

    public static void main(String[] args) {
        int[] array = {10, 5, 50, 2, 20, 45};

        int smallest = array[0];
        int largest = array[0];
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Largest Number is: " + largest);
        System.out.println("Smallest Number is: " + smallest);

    }
