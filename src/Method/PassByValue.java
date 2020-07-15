package Method;

public class PassByValue {
    public static void main(String[] args) {
        int d = 10;
        int c = 11;
        swap(d,c);

        System.out.println("d = " + d + " c = " + c); // As her the value does not change so we can say method make
        // change in copy and not actual value
    }
    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("d = " + a + " b = " + b);
    }
}
