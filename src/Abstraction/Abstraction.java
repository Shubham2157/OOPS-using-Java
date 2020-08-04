package Abstraction;

public class Abstraction {

    public static void repair(Car car){
        System.out.println("Car is repaired");
    }

    // Abstraction is the Opps concept use to minimise the complexity of a program

    public static void main(String[] args) {
        Audi audi = new Audi();
        WagonR wagonR = new WagonR();

        repair(audi);
        repair(wagonR);
    }
}
