import java.util.Scanner;

public class octalNumbers {
    
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Give the decimal number you want to convert to octal: ");
            int x = in.nextInt();
            
            System.out.println("The binary number is: " + Integer.toOctalString(x));
        }
        
     
     }
}
