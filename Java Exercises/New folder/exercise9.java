import java.util.Scanner;
public class exercise9 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Which number of month would you wish to see?");
        int n=input.nextInt();
        String month[]={"January", "February", "March","April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if(n > 12 || n < 1)
        {
            System.out.println("No month for the number "+n);
        }
        else
        {
            System.out.println(month[n-1]);
        }
    }
}
        

