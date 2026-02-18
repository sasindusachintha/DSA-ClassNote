import java.util.Scanner;

public class ageDemo {
    public static void main(String[] args){
        int age;

       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter Your Age: ");
       age = sc.nextInt();
       
       if(age >= 21){
           System.out.println("An Adult");
       }else{
           System.out.println("children");
       }
       sc.close();
    }
}
