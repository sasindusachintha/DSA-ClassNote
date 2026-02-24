public class linearSearch {
   public static int linear(int[] arr, int key){
       int n = arr.length;
       
       for(int i = 0 ; i < n ; i++){
           if(arr[i] == key){
               return i;
           }
       }
       return -1;
   }    
   
   public static void main(String[] args){
       int[] arr = {4, 2, 7, 1, 9} ;
       int key = 2;
       
       int index = linear(arr, key);
       
       if(index != -1){
           System.out.println("Element found at index " + index);
       }else{
           System.out.println("Element not found!");           
       }
   }
}
