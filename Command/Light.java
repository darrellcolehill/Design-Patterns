package Command;

public class Light {

    public int id = -1; 

    public Light(int id) {
        this.id = id;
    }

    public void turnOn() {
        System.out.println("Turning on light " + id);
    }

    public void turnOff() {
        System.out.println("Turning off light " + id);
    }

    public void up() {
        System.out.println("Turning up light " + id);
    }

    public void down() {
        System.out.println("Turning down light " + id);
    }
}
