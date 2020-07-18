package Inheritance;

public class Person {

    protected String name;

    public Person(String name){
        this.name = name;
        System.out.println("Inside the person constructor"+ name);
    }

    public void walk()
    {
        System.out.println(name+ " Can Walk");
    }
    public void eat()
    {
        System.out.println(name + " Can Eat");
    }

    public static void laughing(){
        System.out.println("Person is laughing");
    }

}
