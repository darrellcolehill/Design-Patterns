package Factory.animals;

public class Dog extends Animal {

    public Dog(int length, float weight) {
        this.appendages = 4;
        this.lengthInFeet = length;
        this.weight = weight;
    }

    @Override
    public void talk() {
        System.out.println("Bark bark, roof roof");
    }

    @Override
    public void move() {
        System.out.println("dog is running...");
    }
    
}
