package Observer;

public class PhoneDisplay implements IObserver{

    public WeatherStation weatherStation;
    public int phoneID;

    @Override
    public void update() {
        System.out.println("Phone: " + phoneID + " Temperature: " + weatherStation.getTemperature());
    }

    public PhoneDisplay(WeatherStation weatherStation, int phoneID) {
        this.weatherStation = weatherStation;
        this.phoneID = phoneID;
    }
    
}
