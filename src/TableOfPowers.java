import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int userNum = 0;
		int userSquare = 0;
		int userCube = 0;
		char userChoice = 'y';
		
		//Test Change

		System.out.println("Learn your squares and cubes!");
		System.out.println();

		while (userChoice == 'y' || userChoice == 'Y') {
			System.out.print("Enter an integer: ");
			userNum = scnr.nextInt();
			System.out.println();

			System.out.printf("%-10s %-10s %-10s", "Number", "Squared", "Cubed");
			System.out.println();

			System.out.printf("%-10s %-10s %-10s", "========", "========", "========");
			System.out.println();

			for (int i = 1; i <= userNum; i++) {

				userSquare = i * i;
				userCube = i * i * i;
				System.out.printf("%-10s %-10s %-10s", i, userSquare, userCube);
				System.out.println();

			}

			System.out.println();

			do {
				System.out.print("Would you like to continue? (y/n) ");
				userChoice = scnr.next().charAt(0);
			} while (userChoice != 'n' && userChoice != 'N' && userChoice != 'y' && userChoice != 'Y');

			System.out.println();
		}

		scnr.close();
	}

}
