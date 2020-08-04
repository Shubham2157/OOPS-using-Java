package Abstraction;

public class Audi extends Car{

    String car = "Audi";

    @Override
    public void accelerate() {
        System.out.println(car + " is accelerating");
    }

    @Override
    public void breaking() {
        System.out.println(car + " is breaking");
    }

}
