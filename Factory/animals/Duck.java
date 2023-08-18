package Factory.animals;

public class Duck extends Animal {

    public Duck(int length, float weight) {
        this.appendages = 2;
        this.lengthInFeet = length;
        this.weight = weight;
    }

    @Override
    public void talk() {
        System.out.println("Quack quack");
    }

    @Override
    public void move() {
        System.out.println("duck is waddle waddlint to you...");
    }
    
}
