import java.util.Scanner;

public class LibraryManagement {

    static String[] books = {
            "Java Programming",
            "Python Basics",
            "Data Structures",
            "Operating Systems",
            "Computer Networks"
    };

    static boolean[] issued = new boolean[books.length];

    public static void displayBooks() {

        System.out.println("\nAvailable Books:");

        for (int i = 0; i < books.length; i++) {

            if (!issued[i]) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }
    }

    public static void issueBook(int bookNo) {

        if (bookNo < 1 || bookNo > books.length) {
            System.out.println("Invalid Book Number.");
        } else if (issued[bookNo - 1]) {
            System.out.println("Book is already issued.");
        } else {
            issued[bookNo - 1] = true;
            System.out.println("Book issued successfully.");
        }
    }

    public static void returnBook(int bookNo) {

        if (bookNo < 1 || bookNo > books.length) {
            System.out.println("Invalid Book Number.");
        } else if (!issued[bookNo - 1]) {
            System.out.println("Book was not issued.");
        } else {
            issued[bookNo - 1] = false;
            System.out.println("Book returned successfully.");
        }
    }

    public static void searchBook(String name) {

        boolean found = false;

        for (int i = 0; i < books.length; i++) {

            if (books[i].equalsIgnoreCase(name)) {

                found = true;

                if (issued[i])
                    System.out.println("Book is currently issued.");
                else
                    System.out.println("Book is available.");
            }
        }

        if (!found)
            System.out.println("Book not found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n====== LIBRARY MENU ======");
            System.out.println("1. Display Books");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    displayBooks();
                    break;

                case 2:
                    System.out.print("Enter book name: ");
                    searchBook(sc.nextLine());
                    break;

                case 3:
                    displayBooks();
                    System.out.print("Enter book number: ");
                    issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter book number: ");
                    returnBook(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}