package designpatterns.abstractfactorypattern;

public class AbstractFactoryPatternExample {

    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo***\n");

        //Making a wild dog and tiger through WildAnimalFactory
        AnimalFactory wildAnimalFactory = new WildAnimalFactory();
        Dog wildDog = wildAnimalFactory.createDog();
        wildDog.speak();
        wildDog.preferredAction();
        Tiger wildTiger = wildAnimalFactory.createTiger();
        wildTiger.speak();
        wildTiger.preferredAction();

        //Making a pet dog and tiger through PetAnimalFactory
        AnimalFactory petAnimalFactory = new PetAnimalFactory();
        Dog petDog = petAnimalFactory.createDog();
        petDog.speak();
        petDog.preferredAction();
        Tiger petTiger = petAnimalFactory.createTiger();
        petTiger.speak();
        petTiger.preferredAction();
    }
}
