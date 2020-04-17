package designpatterns.prototype;

public class Nano extends BasicCar {

    public Nano(String modelName) {
        this.modelName = modelName;
        this.basePrice = 100000;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}