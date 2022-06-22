package demo2;

public class DebugTest {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        new DebugTest().fun();

        int a = 1;

        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
    }

    private void fun() {
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
}
