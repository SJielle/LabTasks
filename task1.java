import java.util.Scanner;

public class task1{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] department = new String[3];
		String[] admin = new String[3];
		String[] member = new String[3];
		
			
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter a department name: ");
			department[i] = sc.nextLine();
			System.out.println();
			
			System.out.println("Enter an admin name: ");
			admin[i] = sc.nextLine();
			System.out.println();
			
			System.out.println("Enter member name: ");
			member[i] = sc.nextLine();
			System.out.println();
			
		}
			
			
			/*System.out.println("Enter a department name: ");
			department[1] = sc.nextLine();
			System.out.println();
			
			System.out.println("Enter an admin name: ");
			admin[1] = sc.nextLine();
			System.out.println();
			
			System.out.println("Enter member name: ");
			member[1] = sc.nextLine();
			System.out.println();
			
			System.out.println("Enter a department name: ");
			department[2] = sc.nextLine();
			System.out.println();
			
			System.out.println("Enter an admin name: ");
			admin[2] = sc.nextLine();
			System.out.println();
			
			System.out.println("Enter member name: ");
			member[2] = sc.nextLine();
			System.out.println();*/
			
		for(int i = 0; i < 3; i++) {	
		System.out.println("Department:"+ department[i]+ "    Admin:"+admin[i]+"    Member name:"+member[i]);
		}
	}

}
