 import java.util.Scanner;
 
 
public class passfail {
    public static void main(String[] args){
       int marks;

       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter Your Marks: ");
       marks = sc.nextInt();
       
       if(marks < 0 || marks >100){
         System.out.println("Invalid Marks!");
       }
       else if( marks >= 80 ){
           System.out.println("A");
       }else if(marks >= 60){
           System.out.println("B");
       }else if(marks >= 40){
           System.out.println("C");
       }else if(marks >= 30){
           System.out.println("S");
       }else{
           System.out.println("F");
       }
       sc.close();
    }
}