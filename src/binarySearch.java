public class binarySearch {
    public static int BinarySearch(int[] arr, int key){
        int low = 0 , high = arr.length - 1 ;
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(arr[mid] == key) return mid;
            else if(arr[mid] < key) low = mid + 1;
            else high = mid -1 ;
        }
    return -1;
    }    
    public static void main(String[] args){
        int[] arr = {12,34,56,87,89};
        
        int key = 34 ;
        
        int index = BinarySearch(arr, key) ;
        
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found!");
        }
    }  
}
