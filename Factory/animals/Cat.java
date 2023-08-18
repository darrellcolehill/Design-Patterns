package Factory.animals;

public class Cat extends Animal {


    public Cat(int length, float weight) {
        this.appendages = 4;
        this.lengthInFeet = length;
        this.weight = weight;
    }

    @Override
    public void talk() {
        System.out.println("Meow meowwwwwwwww");
    }

    @Override
    public void move() {
        System.out.println("cat is slowly walking to you...");    
    }
    
}
