package Question1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int temp1 = 0;
		int temp2 = 1;
		int sum;
		for (int i = 0; i <= 8; i++) {
			System.out.println(+temp1);
			sum = temp1 + temp2;
			temp1 = temp2;
			temp2=sum;
			

		}

	}

}
