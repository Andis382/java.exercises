import java.util.Scanner;
public class friday {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to insert?");
        int number = input.nextInt();

        boolean positiveEven = true;

        for (int i=0; i<number; i++){
            System.out.println("Insert next number");
            int n = input.nextInt();

            if(n<0 || n%2 !=0) positiveEven = false;

        }

        if(positiveEven)System.out.println("All numbers are positive and even.");
        else System.out.println("No");
    }
}
