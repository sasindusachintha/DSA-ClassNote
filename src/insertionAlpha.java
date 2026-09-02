
public class insertionAlpha {
   public static void Stringinsertion(String[] arr) {
   // Stores the length of the array in variable n
        int n = arr.length;

      // Starts a for loop from the second element (index 1)
      // and continues until the end of the array
        for (int i = 1; i < n; i++) {
           // Stores the current element in a variable called key
            // This is the element we want to insert into its correct position
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


