/*START
  GET number1 from user input
  READ number1

  GET number2 from user input
  READ number2

  CALCULATE average:
      sum = number1+ number2
      average = (number1 + number2) / 2

DISPLAY :
      "Average: " + average
      "Sum: " + sum
END
*/

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
     int n1, n2;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter Number 1: ");
     n1 = sc.nextInt();
     
     System.out.println("Enter Number 2: ");
     n2 =sc.nextInt();
     
     int sum = n1 + n2 ;
     int avg = (n1+n2)/2 ;
     
     System.out.println("Sum: "+ sum);
     System.out.println("Average: "+ avg);
    
     sc.close();
    }
}
