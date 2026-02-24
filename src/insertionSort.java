
public class insertionSort {
    public static void insertion(int[] arr){
        int n = arr.length;
        
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i-1;
            
            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
     public static void main(String[] args) {
        int[] arr = {10, 3, 4, 23, 56, 20};

        System.out.print("Unsorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        
        System.out.println();
        insertion(arr);
        System.out.print("sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
    }
   System.out.println();     
  }
}