import java.util.Scanner;

public class reversenumber {
    public static void main(String args[]) {
        int number, reversed = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = sc.nextInt();

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reversed);

        sc.close();
    }
}