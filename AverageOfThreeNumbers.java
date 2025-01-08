import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num1");
        double num1 = scanner.nextDouble();
		System.out.println("Enter the num2");
        double num2 = scanner.nextDouble();
		System.out.println("Enter the num3");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("the average is : " + average);
    }
}
