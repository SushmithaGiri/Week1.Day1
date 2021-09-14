package week1.Day2Assignment;

public class Amstrong {

	int number = 15;

	int sum, remainder = 0;

	public void calculate() {
		int quotient;

		do {
			remainder = number % 10;
			remainder = (remainder * remainder * remainder);
			quotient = number / 10;
			number = quotient;
			sum = sum + remainder;
			 
		} while (quotient >= 1);
		{
			if (number == sum) {
				System.out.println(+sum + " is an amstrong number");
			} else {
				System.out.println(+sum + " is not an amstrong number");
			}

		}

	}

	public static void main(String[] args) {
		Amstrong ams = new Amstrong();
		ams.calculate();

	}

}
