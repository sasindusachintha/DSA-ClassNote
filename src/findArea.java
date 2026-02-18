/*START
  get radius from user input
  READ radius

  CALCULATE area using formula:
      area = π * radius * radius

  DISPLAY "Area: " + area
END
*/


import java.util.Scanner;

public class findArea {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
     
        double r ;
        
        System.out.println("Enter Radius Value: ");
        r = sc.nextDouble();
       
       double Area = 3.14 * r * r ;
       
       System.out.println("Area: " + Area);
    
    }
}

