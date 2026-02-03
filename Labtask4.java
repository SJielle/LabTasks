import java.util.Arrays;
import java.util.Scanner;

public class Labtask4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many names you want to enter? ");
		int name = sc.nextInt();
		sc.nextLine();
		
		System.out.println("---------------------------------------");
		String[] names = new String[name];
		int n = names.length;
		
		for(int i= 0; i < name;i++) {
			
			System.out.println("Enter a name: ");
			names[i] = sc.nextLine(); 
			
			System.out.println("Inserted: "+names[i]+"\n");
		}
		
		System.out.println("----------Names Before Sorting------------------\n");
		System.out.println( Arrays.toString(names)+"\n");
		
		System.out.println("================================================\n");
		for(int i= 0;i < n -1;i++) {
			
			for(int j = 0;j < n -i -1;j++) {
				
				System.out.println("Compare: "+names[j]+" and "+names[j + 1]);
				if(names [j] .compareToIgnoreCase(names[j +1]) > 0) {
					
					String temp = names[j];
					names[j] = names[j +1];
					names[j+1] = temp;
					System.out.println("Swapped -> "+Arrays.toString(names));
					System.out.println();
				}else {
					System.out.println("No swap");
					System.out.println();
				}
				
			}
			
		}
		System.out.println("---------------Names After Sorting------------------\n");
		System.out.println( Arrays.toString(names));
	}

}