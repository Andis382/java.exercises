import java.util.Scanner;
public class mask {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //The user inputs the first number
        System.out.println("Enter the first number from 0 to 3");
        int p1risk = sc.nextInt();
        
        //Method that prints out a warning in case the number is not from 0 to 3
        if(p1risk > 3 || p1risk < 0)
        {
            System.out.println("The number entered is not an option");
            System.exit(0);
        }

        //The user inputs the first number
        System.out.println("Enter the second number from 0 to 3");
        int p2risk = sc.nextInt();

        //Method that prints out a warning in case the number is not from 0 to 3
        if(p2risk > 3 || p2risk < 0)
        {
            System.out.println("The number entered is not an option");
            System.exit(0);
        }

        //Switch statement for both persons
        switch (p1risk){
            case 0: System.out.println("The first person doesn't wear a mask and has a 100% chance of infection."); break;
            case 1: System.out.println("The first person is wearing  a surgical mask and has an 80% chance of infection."); break;
            case 2: System.out.println("The first person is wearing an FPP2 mask and has a 18% chance of infection."); break;
            case 3: System.out.println("The first person is wearing an FPP3 mask and has a 0% chance of infection"); break;
            default: System.out.println("The first person does not wear a mask and has a 100% chance of infection.");
        }

        switch (p2risk){
            case 0: System.out.println("The second person does not wear a mask and has a 100% chance of infection."); break;
            case 1: System.out.println("The second person is wearing  a surgical mask and has an 80% chance of infection."); break;
            case 2: System.out.println("The second person is wearing an FPP2 mask and has a 18% chance of infection."); break;
            case 3: System.out.println("The second person is wearing an FPP3 mask and has a 0% chance of infection"); break;
            default: System.out.println("The second person does not wear a mask and has a 100% chance of infection.");
        }
    }
}