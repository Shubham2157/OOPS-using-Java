package Inheritance;

public class Teacher extends Person {


    public Teacher(String name) {
        super(name);
        System.out.println(name + "Inside Teacher constructor ");
    }

    public void teaches()
    {
        System.out.println(name + " Can Teaches");
    }
    public void eat()
    {
        super.eat(); // super will access the parent class
        System.out.println("person " + name + " Can Eat"); // overriding method as same method in parent class and child class

    }
    public static void laughing(){
        System.out.println("Person is laughing");
    }


}
