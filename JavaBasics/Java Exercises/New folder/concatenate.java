import java.util.Scanner;
public class concatenate {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Insert the first word");
    String a = sc.nextLine();

    System.out.println("Insert the second word");
    String b = sc.nextLine();

    System.out.println("Insert the third word");
    String c = sc.nextLine();

    System.out.println(a + "*" + b + "*" + c);
    }
    
}
