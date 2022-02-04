public class Weather {
    
    private double temp;
    private double humidity;
    private double wind;
    private boolean rain;
    private String name;
    Location location;

    public Weather(double temp, double humidity, double wind, boolean rain, String name, Location location) {
        this.temp = temp;
        this.humidity = humidity;
        this.wind = wind;
        this.rain = rain;
        this.name = name;
        this.location = location;
    }
    @Override
    public String toString(){
        return "The weather in " + this.location.getName() + " is " + this.name + " the temp is " + this.temp;

    }
}
