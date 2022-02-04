import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<Location> locations = new ArrayList<locations>();
        locations.add(new Location("Shkoder","Bushat","Albania",14442,13212));
        locations.add(new Location("Tirana","Kamez","Albania",16442,15212));
        ArrayList<Weather> weathers = new ArrayList<Weather>();
        weathers.add(new Weather(30,42,12,13,true,"Rainy",locations.get(0)));
        System.out.println(weathers);
    }
}
