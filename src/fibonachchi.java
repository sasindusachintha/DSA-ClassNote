
// Iterative method to generate Fibonacci series
public class fibonachchi {
   public static void main(String[] args){

      // Number of Fibonacci terms to generate
       int n = 100;

       // First Fibonacci number
       int a =0;

       // Second Fibonacci number
       int b = 1;

       // Print the first two Fibonacci numbers
       System.out.print(a+" "+ b+ " ");

       // Start from the 3rd term and continue up to n
       for(int i= 3; i <=n ; i++){
            int fib = a+b;
            System.out.print(fib+ " ");
            a = b ;
            b = fib;
       }
   }    
}
