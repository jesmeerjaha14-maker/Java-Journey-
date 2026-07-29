class Rectangle {
    int l, b;
    Rectangle(int l) {
        this.l = l;
    }
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void display() {
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
    }

    void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }
}
public class keyword {
    public static void main(String[] args) { 
        Rectangle r = new Rectangle(5, 10);
        r.display();
        r.area();
    }
}
