import java.util.Scanner;

public class exercise4 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert the temperature in Celcius");
        int Celcius = input.nextInt();
        float Farenheit;

        Farenheit = (9 / 5) * Celcius + 32;

        System.out.println("The temperature converted to Farenheit is: ");
        System.out.println(Farenheit);
   }
}
