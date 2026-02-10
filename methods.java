import java.util.Scanner;
class Example1{
    void hello() {
        System.out.println("Hello");
    }
    void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.add(10,20);
    }
}

class Example2 {
    int getNumber() {
        return 10;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        int result = obj.getNumber();
        System.out.println(result);
    }
}

class Example3 {
    static void staticMethod() {
        System.out.println("I am static");
    }

    void instanceMethod() {
        System.out.println("I am instance");
    }

    public static void main(String[] args) {
        staticMethod();
        Example3 obj = new Example3();
        obj.instanceMethod();
    }
}

class Example4 {
    void greet(String name) {
        System.out.println("Hello: " + name);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scn.nextLine();

        Example4 obj = new Example4();
        obj.greet(name);
    }
}