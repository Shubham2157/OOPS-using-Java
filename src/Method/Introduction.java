package Method;

public class Introduction {
    public static void main(String[] args) {
        System.out.println(maxOfTwoNumber(10,15));
        //Non-static method 'maxOfTwoNumber(int, int)' cannot be referenced from a static context
        // to find the main method click ctrl and move cursor on calling function or method
        //Pass by value a copy of argument is pass to method and the changes made in that method is restricted to that
        // method scope and not changed in actual value.
        //but in pass by reference value changes in function call if made in method as reference is send

        // Java is always pass by  value
    }
    static int maxOfTwoNumber(int a, int b)
    {
        if (a>b){
            return a;
        }else return b;
    }
}
