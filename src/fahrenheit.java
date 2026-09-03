/*START
  get Fahrenheit value from user input
  READ Fahrenheit value

  CALCULATE Celsius using formula,
      Celsius = (5 / 9) * (Fahrenheit - 32)

  DISPLAY "Celcius Value: " + Celsius
END
*/

// imoort scanner
import java.util.Scanner;


public class fahrenheit {
// main method
   public static void main(String[] args){

     //create scanner object
       Scanner sc = new Scanner(System.in);
       double f;
       
       System.out.print("Enter Fahrenheit Value: ");

       //get user input from console
       f = sc.nextDouble();
       
       double Celcius = (5.0/9.0)* (f-32);
       
// print value
       System.out.println("Celcius Value: " + Celcius);
   }    
}

