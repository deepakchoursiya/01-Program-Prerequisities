import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of Rectangle");
        double length = scanner.nextDouble();
		System.out.println("Enter Width of Rectangle");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of rectangle is : "+ perimeter);
    }
}
