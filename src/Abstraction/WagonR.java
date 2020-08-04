package Abstraction;

public class WagonR extends Car{

    String car = "WagonR";

    @Override
    public void accelerate() {
        System.out.println(car + " is accelerating");
    }

    @Override
    public void breaking() {
        System.out.println(car + " is breaking");
    }
}
