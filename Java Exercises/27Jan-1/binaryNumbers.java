import java.util.Scanner;

public class binaryNumbers {
    
    
     public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
         System.out.print("Give the decimal number you want to convert to binary and hexadecimal: ");
           int x = in.nextInt();
           
           System.out.println("The binary number is: " + Integer.toBinaryString(x));
           System.out.println("The hexadecimal number is: " + Integer.toHexString(x));
      }
     }
     }