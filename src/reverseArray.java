public class reverseArray {
 public static void main(String[] args){

   // Store the original word
     String word = "ICBT";

   // Create an empty string to store the reversed word
     String reversed = " ";

   // Start from the last character and move towards the first character
     for (int i = word.length()-1; i >=0 ;i--){
      
      // Add the current character to the reversed string
         reversed = reversed + word.charAt(i);
     }

     // Display the original word
   System.out.println("Original: "+ word);
   System.out.println("Reversed: "+ reversed);
 }
}
