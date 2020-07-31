package Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        Pet p = d;
        Animal a = d;

        d.walk();
        p.walk(); // it will call the method of dog class not pet class as p is also of d type.
        // It is also known as dynamic binding, late binding or overriding as well


        System.out.println(d.name);
        System.out.println(p.name);
        // variable cannot be override but hide only


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

    // OutPut

    //"C:\Program Files\Java\jdk-10.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.2\lib\idea_rt.jar=64106:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\KIIT\IdeaProjects\ObjectOrientedProgramming using java\out\production\ObjectOrientedProgramming using java" Polymorphism.MainClass
    //Dog is walking
    //Dog is walking
    //Doggy
    //Micky
    //Good Morning
    //Hello there
    //
    //Process finished with exit code 0
}
