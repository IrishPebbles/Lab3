import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

//		int userNum = 0;
		String userChoice = "y";
		
		System.out.println("Learn your squares and cubes!");
		System.out.println();

		while (userChoice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer: ");
//			userNum = scnr.nextInt();
			System.out.println();
			
			System.out.printf("%-10s %-10s %-10s", "Number", "Squared", "Cubed");
			System.out.println();

			System.out.printf("%-10s %-10s %-10s", "========", "========", "========");
			System.out.println();

			for (int i = 1; i <= scnr.nextInt(); i++) {
				
				System.out.printf("%-10s%-10s %-10s", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
				System.out.println();

			}

			System.out.println();

			do {
				System.out.print("Would you like to continue? (y/n) ");
				//userChoice = scnr.next().charAt(0);
//				userChoice = scnr.nextLine().substring(0);
				
			} while (!scnr.nextLine().substring(0).equalsIgnoreCase("y") && !scnr.nextLine().substring(0).equalsIgnoreCase("n"));

			System.out.println();
		}

		scnr.close();
	}

}
