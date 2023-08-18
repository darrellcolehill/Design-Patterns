package Factory.animals;

public abstract class Animal {
    int appendages = 0;
    float weight = 0; 
    int lengthInFeet = 0;

    public abstract void talk();

    public abstract void move();
}
