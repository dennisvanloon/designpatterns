package designpatterns.factorymethod;

public class ModifiedFactoryMethodPatternExample {

    public static void main(String[] args) {
        System.out.println("***Modified Factory Pattern Demo***\n");

        // Creating a Tiger using the Tiger Factory
        AnimalFactory tigerFactory = new TigerFactory();
        Animal aTiger = tigerFactory.createAnimal();

        // Creating a Dog using the Dog Factory
        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.createAnimal();
    }
}
