import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principal amount");
        double principal = scanner.nextDouble();
		System.out.println("Enter rate of Interest");
        double rate = scanner.nextDouble();
		System.out.println("Enter time in year");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The simple interest is " + simpleInterest);
        scanner.close();
    }
}
