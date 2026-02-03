import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
	

		        Scanner sc = new Scanner(System.in);

		                           // [Store][Product][Brand]
		        String[][][] grocery = new String[3][3][3];

		        // INPUT
		        for (int store = 0; store < grocery.length; store++) {
		            System.out.println("\nStore " + (store + 1));

		            for (int product = 0; product < grocery[store].length; product++) {
		                System.out.println(" Product " + (product + 1));

		                for (int brand = 0; brand < grocery[store][product].length; brand++) {
		                    System.out.print("  Enter brand " + (brand + 1) + ": ");
		                    grocery[store][product][brand] = sc.nextLine();
		                }
		            }
		        }

		        // OUTPUT
		        System.out.println("\n\nProducts and Brands in each store\n");
		        for (int store = 0; store < grocery.length; store++) {
		            System.out.println("Store " + (store + 1));

		            for (int product = 0; product < grocery[store].length; product++) {
		                System.out.print(" Product " + (product + 1) + ": ");

		                for (int brand = 0; brand < grocery[store][product].length; brand++) {
		                    System.out.print(grocery[store][product][brand] + " ");
		                }
		                System.out.println();
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
		

}
