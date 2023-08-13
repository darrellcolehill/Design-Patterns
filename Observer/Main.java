package Observer;


public class Main {

    public static void main(String args[]) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phone1 = new PhoneDisplay(weatherStation, 1);
        PhoneDisplay phone2 = new PhoneDisplay(weatherStation, 2);

        // NOTE: I could streamline this by adding the phone to the weahterStation in the PhoneDisplay constructor
        // but I like this example more because is more clearly demonstrates that the phones must be added
        // to the weatherStation's observer list
        weatherStation.add(phone1);
        weatherStation.add(phone2);

        weatherStation.setTemperature(32);


        WeatherStation weatherStation2 = new WeatherStation();
        PhoneDisplay phone3 = new PhoneDisplay(weatherStation2, 3);
        weatherStation.add(phone3);
        weatherStation2.setTemperature(102);

    }
}