package Strategy;

public class NoFlyBehavior implements IFlyBehavior {
    public void fly() {
        System.out.println("Not flying :(");
    }
}