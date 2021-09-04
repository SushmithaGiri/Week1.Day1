package Question3;

public class primeNumbers {

	public static void main(String[] args) {
		int number = 12;
		boolean flag =false;
		for (int i = 2; i <= (number - 1); i++) {
			if(number % i == 0) {
							
					System.out.println("Not a prime");
					break;
				
				
				}
			else {
				System.out.println("Prime");
				break;
			}
			}
			
			

		}

	}


