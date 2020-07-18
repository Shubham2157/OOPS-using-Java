package StaticKeyword;

public class StaticBlock {
    static {
        System.out.println("Block 1 executed"); // static block executed first then main fun is executed
    }
    static {
        System.out.println("Block 2 executed");
    }

    public static void main(String[] args) {

            System.out.println("Main fun executed executed");

    }
}
