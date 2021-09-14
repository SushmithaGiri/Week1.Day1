package week1.Day2Assignment;

import java.util.Arrays;

public class FindIntersection {
	int array1[] = {11,12,13,14,16};
	int array2[] = {11,12,13,14,15};
	int length1= array1.length;
	int length2=array2.length;
	
	public void matching() {
		if(length1==length2) {
			System.out.println("lengths are same"+length1);
for(int i=0;i<=length1-1;i++) {
	for(int a=0;a<=length2-1;a++) {
		
			if (i==a) {
				int val1=array1[i];
				int val2 = array2[a];
				
				if(val1==val2) {
				System.out.println(+val1+"val1");
				
				  System.out.println("Its matching" +val1 +"=" +val2);
					i++;
				}
				   
				  else {
					  System.out.println(array2[a] + " is missing"); 
				  break;
				  }
		}
	
		
		}
}
		}	
		else {
			System.out.println("length of the arrays are not same ");
			
		}
		
	
			
		}
	
	


	public static void main(String[] args) {
		FindIntersection match = new FindIntersection();
		match.matching();
		
		
	}

}
