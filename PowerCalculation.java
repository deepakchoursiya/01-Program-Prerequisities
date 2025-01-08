import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base");
        double base = scanner.nextDouble();
		System.out.println("Enter the exponent");
        int exponent = scanner.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println("the result is : " + result);
    }
}
