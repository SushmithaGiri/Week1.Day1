package week1.Day2Assignment;

public class MissingNumberInArray {

	int[] numbers = { 1, 2, 4,6 };
	int a = 1;

	public void missingNumber() {
		
		
		  int leng = numbers.length; 
		  int lastvalue = numbers[leng - 1];
		  for (int i = 0;i <= leng; i++) {
		 
		 
		  System.out.println(+a + "= initial a"); 
		  int num = numbers[i];
		  System.out.println(+num + " = Number"); 
		  if (num == a) {
		  
		  a++;
		  } 
		  else {
			  System.out.println(+a + " is missing"); 
		  break;
		 
		  } }
		
		

	}

	public static void main(String[] args) {
		MissingNumberInArray missing = new MissingNumberInArray();
		missing.missingNumber();
		
	}
}
