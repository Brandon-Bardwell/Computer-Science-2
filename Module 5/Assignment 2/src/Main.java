import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		String s = input.next();
		System.out.println("The fractional number is " + new BigRational(s));

	}

}
