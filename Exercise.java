import java.lang.System;

class Exercise{
    public static void main(String[] args)
    {
        String name = "vidyavahini";
        int age = 20;
        float height = 5.5f;
        double weight = 60.5;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
    }
}


class Exercise1{
    public static void main(String[] args){
        int a = 15;
        int b = 10;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double division = (double)a / b;
        System.out.println("sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Division: "+division);
    }

}

class demo5 {
    public static void main(String[] args) {
        int[] num= {10,20,30,40,50};
            System.out.println(num[0]);
        
    }
}

class demo6{
    public static void main(String[] args) {
        int[][] num={{10,20},{30,40}};
        System.out.println(num[1][1]);
    }
}
