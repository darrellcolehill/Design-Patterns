package Strategy;

public class Bird {
    private IFlyBehavior flyBehavior;
    private ITalkBehavior talkBehavior; 

    public Bird(IFlyBehavior flyBehavior, ITalkBehavior talkBehavior) {
        this.flyBehavior = flyBehavior;
        this.talkBehavior = talkBehavior;
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    public void talk() {
        talkBehavior.talk();
    }
}
