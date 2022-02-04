import java.util.Scanner;
public class auxiliary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
            
    System.out.println("Insert the amount of strings you want to be repeated ");
    String string = sc.nextLine();

    System.out.println("How many times should the string be repeated ");
    int number = sc.nextInt();


    }
    public static void Repeat(String s, int n)
    {
        if(n <=0)
        System.out.println("Please enter a number larger than 0");
        else {
            for(int i=0; i < n; i++)
            System.out.println(s);

        }
    }
}
