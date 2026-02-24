//Iterative method

public class fibonachchi {
   public static void main(String[] args){
       int n = 100;
       int a =0;
       int b = 1;
       
       System.out.print(a+" "+ b+ " ");
<<<<<<< HEAD
       
=======

      // Iterative
>>>>>>> eb5e28094b2c1a10af6c7caa3ebdfe1f9d65e339
       for(int i= 3; i <=n ; i++){
            int fib = a+b;
            System.out.print(fib+ " ");
            a = b ;
            b = fib;
       }
   }    
}
