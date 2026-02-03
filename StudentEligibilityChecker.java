import java.util.Scanner;

public class StudentEligibilityChecker {

	public static void main(String[] args) {
	

		        Scanner input = new Scanner(System.in);
		        
		        System.out.println("Enter the number of student: ");
		        int number = input.nextInt();
		        input.nextLine();
		        
		        String[] name = new String[number];
		        int[] age = new int[number];
		        double[] grade = new double[number];
		        String[] status = new String[number];
		          
		        
		        for(int i = 0; i < number; i++) {
		        	
		        	System.out.print("Enter the name of the student: ");
		        	name[i] = input.nextLine();
		        	
		        	System.out.print("Enter the age of the student: ");
		        	age[i] = input.nextInt();
		        	input.nextLine();
		        	
		        	System.out.print("Enter the age of the student: ");
		        	grade[i] = input.nextDouble();
		        	input.nextLine();
		        	
		        	System.out.print("Enrollment status: ");
		        	status[i] = input.nextLine();
		        	
		        	System.out.println();
		        	
		        	
		        }
		        
		        System.out.println("-------Student Info---------");
		        System.out.println();

		        for(int i = 0; i < number; i++) {
		        	
		        	boolean info = age[i] >= 18 && grade[i] >= 75 && status[i].equalsIgnoreCase("ENROLLED");
		        	
		        	System.out.println();
		        	System.out.println("Student: "+name[i]);
		        	System.out.println("Age: "+age[i]);
		        	System.out.println("Grade: "+grade[i]);
		        	System.out.println("Status: "+status[i]);
		        	
		        	System.out.println();
		        	
		        	
		        	if(info) {
		        		System.out.println("ELIGIBLE");
		        		
		        	}else { 
		        		System.out.println("NOT ELIGIBLE");
		        	}
		        	
		        }
		        		
	}
		  	    
}

