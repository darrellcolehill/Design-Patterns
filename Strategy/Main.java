package Strategy;

public class Main {
    public static void main(String args[]) {
        Bird penguine = new Bird(new NoFlyBehavior(), new SimpleTalkBehavior());
        penguine.talk();
        penguine.fly();

        Bird stork = new Bird(new SimpleFlyBehavior(), new SimpleTalkBehavior());
        stork.talk();
        stork.fly();
    }
}
