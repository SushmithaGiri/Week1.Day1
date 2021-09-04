package Question2;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		int fact = 1;

		for (int i = 1; i <= number;i++) {

			fact = (fact * i);
			if (i == number) {
				System.out.println("the factorial of " + number + " is " + fact);
			}

		}

	}

}
