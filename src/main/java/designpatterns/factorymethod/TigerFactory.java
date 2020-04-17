package designpatterns.factorymethod;

class TigerFactory extends AnimalFactory {
    public Animal createAnimal() {
        return new Tiger();
    }
}