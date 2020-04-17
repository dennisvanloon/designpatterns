package designpatterns.prototype;

public class PrototypePatternExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***\n");
        BasicCar nanoPrototype = new Nano("Green Nano");
        BasicCar fordPrototype = new Ford("Ford Yellow");

        //Nano
        BasicCar nano = nanoPrototype.clone();
        nano.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + nano.modelName + " and it's price is Rs." + nano.onRoadPrice);

        //Ford
        BasicCar ford = fordPrototype.clone();
        ford.onRoadPrice = ford.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + ford.modelName + " and it's price is Rs." + ford.onRoadPrice);
    }
}
