package Class;

class Cat{
    boolean isfur;
    String color, breeds;
    int lags, eyes;

    public void walk()
    {
        System.out.println("Cat can walk");
    }
    public void eat(){
        System.out.println("cat can eat");
    }
    public void description()
    {
        System.out.println("Cat Has "+ lags + " legs and " + eyes +" eyes");
    }
}

class Dog
{
    String name, bread;

    public void jump()
    {
        System.out.println("My Dog " + name + " jumped");
    }
    public void Description()
    {
        System.out.println("My Dog name is " + name + " and its breed is " + bread);
    }
}

public class MainClass {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//
//        cat1.walk();
//        cat2.eat();
//
//        cat1.lags = 4;
//        cat1.eyes = 2;
//
//        cat1.description();
//        cat2.description();
        Dog husky = new Dog();
        Dog poodle = new Dog();

        husky.bread = "Husky";
        husky.name = "Browny";

        poodle.bread = "Poodle";
        poodle.name = "Mr. Moolchand Ji";

        husky.jump();
        husky.Description();

        poodle.jump();
        poodle.Description();

       // System.out.println();
    }
}
