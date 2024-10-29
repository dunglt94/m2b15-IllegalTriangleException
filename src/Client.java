import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 sides of the triangle: ");
        System.out.print("Side a: ");
        int a = scanner.nextInt();
        System.out.print("Side b: ");
        int b = scanner.nextInt();
        System.out.print("Side c: ");
        int c = scanner.nextInt();

        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
