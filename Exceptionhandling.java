class Exception1{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}

class Exception2{
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("cannot call method on a null object: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}

class Exception3{
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bounds: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}

class Exception4{
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("cannot convert string to number: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}

class Exception5{
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("caught an arithmetic exception: " + e.getMessage());
        } finally {
            System.out.println("this block will always execute.");
        }
        System.out.println("Program continues after exception handling.");
    }
}

class Exceptionthrow{
    public static void main(String[] args) {
        int a = 5;

        if (a < 0) {
            throw new IllegalArgumentException("value cannot be negative: " + a);
        }
        System.out.println("Value is: " + a);
    }
}

class Exceptionthrows{
    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            System.out.println("caught an exception: " + e.getMessage());
        }
    }
    public static void methodThatThrowsException() throws Exception {
        throw new Exception("this is a custom exception message.");
    }
}

class myexception extends Exception {
    public myexception(String message) {
        super(message);
    }
}

class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (myexception e) {
            System.out.println("caught my custom exception: " + e.getMessage());
        }
    }
    public static void validateAge(int age) throws myexception {
        if (age < 18) {
            throw new myexception("age must be at least 18. provided age: " + age);
        }
        System.out.println("age is valid: " + age);
    }
}