package Factory.factories;

import Factory.animals.Animal;

public abstract class AnimalFactory {

    enum AnimalSubType {
        DOG, CAT, DUCK
    }

    public abstract Animal createAnimal();
}
