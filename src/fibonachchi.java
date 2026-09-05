
// Iterative method to generate Fibonacci series
public class fibonachchi {
   public static void main(String[] args){

      // Number of Fibonacci terms to generate
       int n = 100;
       int a =0;
       int b = 1;
       
       System.out.print(a+" "+ b+ " ");

       for(int i= 3; i <=n ; i++){
            int fib = a+b;
            System.out.print(fib+ " ");
            a = b ;
            b = fib;
       }
   }    
}
