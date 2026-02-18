public class fibonachchi {
   public static void main(String[] args){
         
       
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
