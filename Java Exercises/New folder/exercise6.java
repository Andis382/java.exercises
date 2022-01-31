import java.util.Scanner;
public class exercise6 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert the radius of the cilinder");
        double radius = input.nextDouble();

        System.out.println("Insert the length of the cilinder");
        double length = input.nextDouble();
        
        double area;
        double volume;

        area = radius * radius * Math.PI;
        volume = area * length;

        System.out.println("The value of the area is: ");
        System.out.println(area);

        System.out.println("The value of the volume is: ");
        System.out.println(volume);
   }
}


