package encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
//        student.age = 10;     can not access
//        student.name = "Ram";

        student.setAge(10);
        System.out.println(student.getAge());

    }

}
