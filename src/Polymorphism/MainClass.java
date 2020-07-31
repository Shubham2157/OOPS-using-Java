package Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        Pet p = d;
        Animal a = d;

        d.walk();
        p.walk(); // it will call the method of dog class not pet class as p is also of d type.
        // It is also known as dynamic binding, late binding or overriding as well

        // below is compile time polymorphism

        greeting();
        greeting("Hello there"); // it is also known as static binding, early binding or overriding

    }

    public static void greeting(){
        System.out.println("Good Morning");
    }
    public static void greeting(String s){
        System.out.println(s);
    }
}
