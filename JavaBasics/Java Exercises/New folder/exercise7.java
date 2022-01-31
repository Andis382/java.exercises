import java.util.Scanner;
public class exercise7 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of a ");
        double a = input.nextDouble();

        System.out.println("Enter the value of b ");
        double b = input.nextDouble();
        
        System.out.println("Enter the value of c ");
        double c = input.nextDouble();

        double discriminant = 0.0; 

        discriminant = Math.pow(b,2) - (4 * a * c);
        
        System.out.println("The discriminator value is: "+discriminant);

        if(discriminant > 0)
        {
        double root1 = (-b +Math.pow(discriminant, 0.5)) / (2 * a);
        double root2 = (-b -Math.pow(discriminant, 0.5)) / (2 * a);
        System.out.println("The discriminant has two roots");
        }
        else if(discriminant == 0)
        {
        double root2 = (-b -Math.pow(discriminant, 0.5)) / (2 * a);
        System.out.println("The discriminant has one root");
        }
        else
        System.out.println("The discriminant has no roots");
   }
}

