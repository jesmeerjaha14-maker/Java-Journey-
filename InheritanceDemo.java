import java.util.Scanner;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog dog = new Dog();

        System.out.print("Enter the dog's name: ");
        String dogName = sc.nextLine();

        dog.setName(dogName);

        System.out.println("\n--- Details ---");
        dog.display();
        dog.sound();

        sc.close();
    }
}