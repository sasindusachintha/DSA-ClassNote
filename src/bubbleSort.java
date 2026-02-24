public class BubbleSort {
    public static int bubbleSort(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] data = {45,65,76,23,34,56,67,46};

        int count = bubbleSort(data);

        for (int i : data) {
            System.out.print(i + " ");
        }

        System.out.println("\nCounts: " + count);
    }
}
