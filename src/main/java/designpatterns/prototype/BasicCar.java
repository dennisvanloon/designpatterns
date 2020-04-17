package designpatterns.prototype;

import java.util.Random;

public class BasicCar implements Cloneable {

    private static Random random = new Random();

    String modelName;
    int basePrice;
    int onRoadPrice;

    public String getModelname() {
        return modelName;
    }

    public void setModelname(String modelname) {
        this.modelName = modelname;
    }

    public static int setAdditionalPrice() {
        return random.nextInt(100000);
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
