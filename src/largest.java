import java.util.Scanner;


public class largest {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int A, B, C ;
       
       System.out.print("Enter A: ");  
       A = sc.nextInt();
       System.out.print("Enter B: ");  
       B = sc.nextInt();
       System.out.print("Enter C: ");  
       C = sc.nextInt();
       if(A > B){
           if(A > C){
               System.out.print("Largest is: A");  
           }else{
               System.out.print(" Largest is: C");
           }}else{
               if( B > C){
            System.out.print("The Largest is: B ");
        }else{
            System.out.println("The Largest is: C");
          }
   }    
   }
}