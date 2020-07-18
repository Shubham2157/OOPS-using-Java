package Inheritance;

public class MainClass {
    public static void main(String[] args) {
        Teacher t = new Teacher("mohan");
       // t.name = "mohan";  // inherit from person class
        //System.out.println(t.name);
        t.teaches();
        t.eat();  // inherit from person class
        t.walk(); // inherit from person class


        Singer s = new Singer("Sonu Nigam");
        s.name = "Sonu Nigam";  // inherit from person class
        //System.out.println(t.name);
        s.sing();
        s.eat();  // inherit from person class : overriding method as same method in parent class and child class
        s.walk(); // inherit from person class

//___________________________________________________________________________________________________________________

    }
}
