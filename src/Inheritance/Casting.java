package Inheritance;

public class Casting {
    public static void main(String[] args) {

        // DownCasting

//        Person p = new Person();
//        Teacher t = (Teacher) p;

//        Exception in thread "main" java.lang.ClassCastException: Inheritance.Person cannot be cast to Inheritance.Teacher
//        at Inheritance.Casting.main(Casting.java:8)



        Teacher t1 = new Teacher("");
        Person p = t1;
        Teacher t = (Teacher) p;

        // upCasting

        Teacher t2 = new Teacher("");
        Person p1 = t2;

    }
}
