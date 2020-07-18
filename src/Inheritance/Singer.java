package Inheritance;

public class Singer extends Person {
    public Singer(String name) {
        super(name);
    }

    public void sing(){
        System.out.println(name + " Can Sing");
    }
    public void eat()
    {
        System.out.println( "Person "+ name + " Can Eat"); // overriding method as same method in parent class and child class

    }
    public static void laughing(){
        System.out.println("Person is laughing");
    }


}
