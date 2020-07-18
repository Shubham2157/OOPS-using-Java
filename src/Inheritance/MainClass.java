package Inheritance;

public class MainClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "mohan";  // inherit from person class
        System.out.println(t.name);
        t.teaches();
        t.eat();  // inherit from person class
        t.walk(); // inherit from person class

    }
}
