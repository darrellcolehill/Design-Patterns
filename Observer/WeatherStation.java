package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    List<IObserver> observers = new ArrayList<IObserver>(0);
    int temperature;
    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < this.observers.size(); i++) {
            observers.get(i).update();
        }
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int newTemperature) {
        this.temperature = newTemperature;
        notifyObservers();
    }
    
}
