package Inheritance;

public class InstanceOf {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("");

        Singer s1 = new Singer("");

        Person p = t1;

        Teacher t = (Teacher)p;

        boolean yo = t1 instanceof Teacher;

        System.out.println(t1 instanceof Teacher);
        System.out.println(s1 instanceof Singer);
        System.out.println(t1 instanceof Person);

        System.out.println(t instanceof Person); System.out.println(p instanceof Singer);
    }
}
