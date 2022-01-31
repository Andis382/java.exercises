import java.util.Scanner;
public class asciivalue {
    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
          System.out.print("Input the first number: ");
            int num1 = in.nextInt();
          
          System.out.print("Input the second number: ");
            int num2 = in.nextInt();
          
          System.out.print("Input the third number: ");
            int num3 = in.nextInt();
          
          
          System.out.print("Input the width of the rectangle: ");
          int width = in.nextInt();
          
          System.out.print("Input the height of the rectangle: ");
          int height = in.nextInt();
           
          
            System.out.println(num1 + " The average of the numbers is " + 
            (num1 + num2 + num3) / 3);
          
            System.out.println("*************************************************************");
          
            System.out.println(num1 + " The perimeter of the rectangle is " + 
            (width * 2 + height * 2));
          
            System.out.println(num1 + " The area of the rectangle is " + 
            (width * height));
        }
        
System.out.println("*************************************************************");

  int x = 100, y = 200;
 
  System.out.println("Before Swap");
  System.out.println("x = " + x);
  System.out.println("y = " + y);

  int temp = x;
  x = y;
  y = temp;

  System.out.println("After swap");
  System.out.println("x = " + x);
  System.out.println("y = " + y);
 }
 
}