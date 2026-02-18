public class reverseArray {
 public static void main(String[] args){
     String word = "ICBT";
     String reversed = " ";
     
     for (int i = word.length()-1; i >=0 ;i--){
         reversed = reversed + word.charAt(i);
     }
   System.out.println("Original: "+ word);
   System.out.println("Reversed: "+ reversed);
     
     }    
}
