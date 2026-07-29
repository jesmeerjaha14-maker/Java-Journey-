 import java.util.Scanner;
 class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of 2 numbers: " + obj.add(a, b));

        System.out.println("\nEnter 3 numbers:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("Sum of 3 numbers: " + obj.add(c, d, e));

        System.out.println("\nEnter 4 numbers:");
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        System.out.println("Sum of 4 numbers: " + obj.add(f, g, h, i));

        sc.close();
    }
}