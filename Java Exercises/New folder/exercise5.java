import java.util.Scanner;
public class exercise5 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert the number in Feet");
        double Feet = input.nextDouble();
        double Meter;

        Meter = Feet * 0.305;

        System.out.println("The number in Meters is: ");
        System.out.println(Meter);
   }
}


