/*START
  get Fahrenheit value from user input
  READ Fahrenheit value

  CALCULATE Celsius using formula,
      Celsius = (5 / 9) * (Fahrenheit - 32)

  DISPLAY "Celcius Value: " + Celsius
END
*/

import java.util.Scanner;


public class fahrenheit {
   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       double f;
       
       System.out.print("Enter Fahrenheit Value: ");
       f = sc.nextDouble();
       
       double Celcius = (5.0/9.0)* (f-32);
       
       System.out.println("Celcius Value: " + Celcius);
   }    
}

