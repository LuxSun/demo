package demo0;

public class Test {

    private String name;

    private String age;

    public Test(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Test() {
    }

    private String user_id;

    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("Hello World");
            System.out.println(a);
            System.out.println(a);
            System.out.println(a);
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        // for 循环
        String[] arr = new String[10];
        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {

        }



        for (int i = arr.length - 1; i >= 0; i--) {
            int a = 1;
        }

        run();

    }

    private static void run() {
        new Test().fun("Bob");
    }

    public void fun(String name) {
        String age = "1";
    }
}
