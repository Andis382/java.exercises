import java.util.Scanner;
public class exercise44 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter a number :");
        num = sc.nextInt();
       
        for(int i = 2; i< num; i++) {
           while(num%i == 0) {
              System.out.println(i+" ");
              num = num/i;
           }
        }
        if(num >2) {
           System.out.println(num);
        }
     }
  }
