package StaticKeyword;

import StaticKeyword.A.B;
import StaticKeyword.A.C;

class person{
    int age;
    String name;

    static String breed = "Home sapiens";
}

public class StaticKeyword {
    A objA = new A();
//    A.B objB = objA.new B();
    B objB = objA.new B(); // non static nested class declaration

    C objC = new C(); // static nested class declaration
}
