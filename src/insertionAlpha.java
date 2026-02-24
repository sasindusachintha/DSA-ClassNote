
public class insertionAlpha {
   public static void Stringinsertion(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key)> 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
   
    public static void main(String[] args) {
        
        String[] fruits = {"Apple", "orange", "banana", "Mango", "Pineapple"} ;
        

        System.out.print("Unsorted Array: ");
        for (String x : fruits) {
            System.out.print(x + " ");
        }

        System.out.println();
        Stringinsertion(fruits);
        System.out.print("sorted Array: ");
        for (String x : fruits) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}


