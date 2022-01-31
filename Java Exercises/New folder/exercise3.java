import java.util.Scanner;
public class exercise3 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert a sequence of numbers");
        int num = input.nextInt();
        boolean found = false;

        while(num!=0){

            int prec = num;
            num = input.nextInt();
            if (prec>0 && num<0) found = true;
        }

        if (found) System.out.println("OK");
        else System.out.println("NO");

    }
}