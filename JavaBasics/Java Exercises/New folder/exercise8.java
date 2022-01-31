import java.util.Scanner; 
public class exercise8 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to insert?");
        int number = input.nextInt();
        double average = 0;
        int count = 0;

        for (int i=0; i<number; i++)
        {
            System.out.println("Insert the next number");
            int x = input.nextInt();

            if(x % 3 == 0) 
            {
                count++;
                average += x;
            }
           
        }
        average /= count;
        System.out.println("The average of the numbers divisible by 3 is" + average);    
    }
}
