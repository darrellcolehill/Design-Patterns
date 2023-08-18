package Factory;

import Factory.animals.Animal;
import Factory.factories.AnimalFactory;
import Factory.factories.BalancedAnimalRandomWeightAndSizeFactory;
import Factory.factories.RandomAnimalRandomWeightAndSizeFactory;

public class Main {
    
    public static void main(String args[]) {
        AnimalFactory randomAnimalFactory = new RandomAnimalRandomWeightAndSizeFactory();
        Animal animal1 = randomAnimalFactory.createAnimal();
        Animal animal2 = randomAnimalFactory.createAnimal();
        Animal animal3 = randomAnimalFactory.createAnimal();

        animal1.talk();
        animal2.talk();
        animal3.talk();

        System.out.println("=========================");

        AnimalFactory balancedFactory = new BalancedAnimalRandomWeightAndSizeFactory();
        Animal animal4 = balancedFactory.createAnimal();
        Animal animal5 = balancedFactory.createAnimal();
        Animal animal6 = balancedFactory.createAnimal();
        Animal animal7 = balancedFactory.createAnimal();

        animal4.talk();
        animal5.talk();
        animal6.talk();
        animal7.talk();
    }
}
