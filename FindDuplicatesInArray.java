package week1.Day2Assignment;

public class FindDuplicatesInArray {
	
	
	int array[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int length = array.length;
	int count=1,i;
	//array[i]=array[a];
	
	public void duplicate() {
		for(int i=0;i<=length-1;i++) {
			int initialVal = array[i];
			for(int a=1;a<=length-1;a++) {
				int nxtVal= array[a];
				System.out.println(array[a]);
					
				if(initialVal==nxtVal) {
					count=count+1;
					System.out.println("a"+nxtVal);
					System.out.println(+nxtVal+ " is present "+count+"times");
					
					
				}
								else{
					a++;
					i++;
				}
				
				
			}
			
			
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		FindDuplicatesInArray dupElement = new FindDuplicatesInArray();
		
		dupElement.duplicate();

	}

}
