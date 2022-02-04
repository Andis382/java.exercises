import java.util.Scanner;

public class vowels {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        //The user inputs the string
        System.out.println("Insert the string");
        String a = sc.nextLine();

        //Prints out the vowles used in the string 
        System.out.println("Vowels in the given string are: ");

        
        for(int i=0; i<a.length(); i++){
            
            //Method that checks if the character is a vowel and prints it out in case it is
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'u' || a.charAt(i) == 'o')
            {
                System.out.print("" + a.charAt(i));
            }

        }
          
    }
}