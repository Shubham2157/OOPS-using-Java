package Constructor;

class Vehicle {
    int wheels;
    int headLight;
    String color;

//    Vehicle()
//    {                       // Default constructor is created by java compiler when we do not create any constructor
//        wheels = 4;         // Which have default value i.e : int -> 0; String -> null ....
//                            // This is no argument constructor.
//    }

//   Vehicle(int noOfWheel)
//    {                               // argument constructor is  used to pass some different parameter
//        wheels = noOfWheel;
//        headLight = 2;
//    }

   Vehicle(int wheels)
    {                               // argument constructor is  used to pass some different parameter
        this.wheels = wheels;       // if we use same word in parameter and state(variable in  class) then we use this
        headLight = 2;              // this keyword points to the current object
    }
   Vehicle(int wheels, String color)
    {
        this.wheels = wheels;   // constructor overloading
        this.color = color;
        headLight = 2;
    }

}

public class MyConstructor {
    MyConstructor()
    {
        System.out.println("Constructor is created now");
    }

    public static void main(String[] args) {

//        MyConstructor myConstructor = new MyConstructor();
//        Vehicle car = new Vehicle();
//        Vehicle car2 = new Vehicle();
//        System.out.println(car.wheels + " wheels");
//        System.out.println(car2.wheels + " wheels");

        Vehicle car = new Vehicle(4);
        Vehicle scooty = new Vehicle(2,"Red");
        System.out.println(car.wheels + " wheels " + car.headLight + " Head Lights");
        System.out.println(scooty.wheels + " wheels " + scooty.color + " color " + scooty.headLight + " Head Lights");
    }

//    NOTE : IF WE CREATE A CONSTRUCTOR THEN THE DEFAULT CONSTRUCTOR IS OVERRIDE SO IT WILL BE UNDEFINED
//    IF WE WANT TO USE DEFAULT CONSTRUCTOR THEN WE HAVE TO DEFINE IT

}
