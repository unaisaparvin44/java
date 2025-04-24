import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Shape Calculator ===");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Choose a shape (1-3): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = sc.nextDouble();
                    Shape circle = new Circle(radius);
                    System.out.printf("Area: %.2f\n", circle.area());
                    System.out.printf("Perimeter: %.2f\n", circle.perimeter());
                    break;

                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = sc.nextDouble();
                    Shape rectangle = new Rectangle(length, width);
                    System.out.printf("Area: %.2f\n", rectangle.area());
                    System.out.printf("Perimeter: %.2f\n", rectangle.perimeter());
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
