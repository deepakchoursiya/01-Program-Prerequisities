import java.util.Scanner;
public class AddTwoNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2 = sc.nextInt();
		System.out.println("Total Sum is : " + sum(num1,num2));
	}
	public static int sum(int num1, int num2){
		return num1+num2;
	}
}