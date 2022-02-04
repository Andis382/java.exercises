public class Location {
    private String name;
    private String province;
    private String country;
    private double latitude;
    private double longtitude;

    public Location (String name, String province, String country, double latitude, double longtitude) {
        this.name = name;
        this.country = country;
        this.province = province;
        this.latitude = latitude;
        this.longtitude = longtitude;

    }
@Override
public String toString(){
    return "the location is " + this.name;
}
public String getName(){
    return this.name;
}
}
