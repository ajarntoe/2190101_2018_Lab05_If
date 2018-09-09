import java.util.Scanner;

public class MyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x.");
		double x = s.nextDouble();
		System.out.println("Enter value of y.");
		double y = s.nextDouble();
		double result;

		if (x >= -5 && x <= 5 && y >= 5) {
			result = x * y;
		} else if (x >= -5 && x <= 5 && y < 5) {
			result = 0;
		} else if (x > 5) {
			result = x * x * y;
		} else {
			result = y * y * x;
		}
		System.out.println("The result is " + result + ".");

		s.close();
	}

}
