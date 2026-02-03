import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		
		int[] numbers = {3,5,7,6,8,5,4};
		int n = numbers.length;
		
		for(int i=0; i < n -1 ;i++) {
			System.out.println("--------------------------------------");
			System.out.println("Pass: "+(i+1));
			
			for(int j = 0; j < n -i -1;j++) {
				System.out.println("Pass "+(i + 1));
				if(numbers[j] > numbers[j+1]) {
					
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1]= temp;
					
					System.out.println("Swapped");
					
				}else {
					System.out.println("no swap");
				}
				
				System.out.println(Arrays.toString(numbers));
			}
			
		}	

	}

}
