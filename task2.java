import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);

		        // Rows = rows of seats, Columns = seats per row
		        System.out.print("Enter number of seat rows: ");
		        int rows = sc.nextInt();

		        System.out.print("Enter number of seats per row: ");
		        int cols = sc.nextInt();

		        // 2D array for seating chart
		        String[][] seats = new String[rows][cols];

		        // Student names
		        System.out.println("\nEnter student names for each seat:");
		        for (int row = 0; row < rows; row++) {
		            for (int col = 0; col < cols; col++) {
		                System.out.print("Seat [" + row + "][" + col + "]: ");
		                seats[row][col] = sc.next();
		            }
		        }

		       
		        System.out.println("\nClassroom Seating Arrangement:");
		        for (int row = 0; row < rows; row++) {
		            for (int col = 0; col < cols; col++) {
		                System.out.print(seats[row][col] + "\t");
		            }
		            System.out.println();
		        }

		        sc.close();

	}

}
	
	
		


