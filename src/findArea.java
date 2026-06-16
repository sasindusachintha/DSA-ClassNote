/*START
  get radius from user input
  READ radius

  CALCULATE area using formula:
      area = π * radius * radius

  DISPLAY "Area: " + area
END
*/

// import Scanner
import java.util.Scanner;

public class findArea {
  //main method
    public static void main(String[] args){

      // create scanner objecet
        Scanner sc = new Scanner(System.in);
     
        double r ;
        
        System.out.println("Enter Radius Value: ");
        r = sc.nextDouble();
       
       double Area = 3.14 * r * r ;
       
       System.out.println("Area: " + Area);
    
    }
}

