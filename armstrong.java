import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int originalNum = num;
        int temp = num;
        int count = 0;  
        int result = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }   
        temp = num;
        while (temp != 0) { 
            int digit = temp % 10;
            result += Math.pow(digit, count);
            temp /= 10;
        }                 
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}