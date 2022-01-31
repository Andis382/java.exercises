import java.util.Scanner;

public class exercise2 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert a list of numbers");
        int sum = 0;
        boolean valid;
        do{
            int num = input.nextInt();
            valid = (num <0 && num%2==0) || (num >=0 && num%3==0);
            if(valid) sum += num;

        }while(valid);

        System.out.println("Sum is: ");
        System.out.println(sum);

    }
}