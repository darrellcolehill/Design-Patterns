package Factory.factories;

import java.util.Random;

import Factory.animals.Animal;
import Factory.animals.Cat;
import Factory.animals.Dog;
import Factory.animals.Duck;

public class RandomAnimalRandomWeightAndSizeFactory extends AnimalFactory {

    private int maxLength = Integer.MAX_VALUE;
    private float maxWeight = Float.MAX_VALUE;

    @Override
    public Animal createAnimal() {
        AnimalSubType subType = getRandomAnimalSubType();
        return createAnimalFromSubtype(subType);
    }

    public static AnimalSubType getRandomAnimalSubType() {
        AnimalSubType[] values = AnimalSubType.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex];
    }

    public Animal createAnimalFromSubtype(AnimalSubType subType) {
        if (subType == AnimalSubType.DOG) {
            return new Dog(getRandomLength(), getRandomWeight());
        } else if (subType == AnimalSubType.CAT) {
            return new Cat(getRandomLength(), getRandomWeight());
        } else {
            return new Duck(getRandomLength(), getRandomWeight());
        }
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public float getRandomWeight() {
        Random random = new Random();
        return random.nextFloat() * maxWeight;
    }

    public int getRandomLength() {
        Random random = new Random();
        return random.nextInt(maxLength) + 1; // Adding 1 to avoid 0 length
    }
}
