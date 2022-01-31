import java.util.Scanner;
public class exercise37 { 
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        
        System.out.println("Give the number you want to factor");
        int num = in.nextInt();

       long factorial = factorial(num);
       System.out.println("The factorial of the number " + num + " is " + factorial);
    }

    public static long factorial(int num)
     {
    long factorial = 1;
    for(int i = 1; i <= num; i++)
    {
        factorial *= num;
    }
    return factorial;
 }
}



