import java.util.Scanner;
public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }

        System.out.println("Unique element is: " + result);
    }
}
