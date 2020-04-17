package designpatterns.prototype;

public class Ford extends BasicCar {

    public Ford(String modelName) {
        this.modelName = modelName;
        this.basePrice = 200000;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}