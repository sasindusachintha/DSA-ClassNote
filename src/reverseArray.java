public class reverseArray {
 public static void main(String[] args){
     String word = "ICBT";
     String reversed = " ";
     
     for (int i = word.length()-1; i >=0 ;i--){
         reversed = reversed + word.charAt(i);
     }
   System.out.println("Original: "+ word);
   System.out.println("Reversed: "+ reversed);
<<<<<<< HEAD
     
     }    
=======
   }    
>>>>>>> eb5e28094b2c1a10af6c7caa3ebdfe1f9d65e339
}
