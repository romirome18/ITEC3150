package project1;

public class City implements Comparable{
    private String state;
    private String name;
    private double latitude;
    private double Longitude;
    private double temperature;
    private int uvIndex;
    private boolean isRaining;


    public City(String state, String name, double latitude, double longitude) {
        this.state = state;
        this.name = name;
        this.latitude = latitude;
        Longitude = longitude;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    @Override
    public String toString() {
        return "City{" +
                "state='" + state + '\'' +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", Longitude=" + Longitude +
                ", temperature=" + temperature +
                ", uvIndex=" + uvIndex +
                ", isRaining=" + isRaining +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        City city = (City) o;
      //  Double thisTemp = this.getTemperature();
       // Double thatTemp = city.getTemperature();
       return ((Double) city.getTemperature() ).compareTo(this.getTemperature());
       // return thisTemp.compareTo(thatTemp);
    }
}
