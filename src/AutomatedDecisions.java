import java.util.Scanner;

public class AutomatedDecisions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ask;
		int numbaEntered;
		System.out.println("Hi there. What's your name? ");
		String name = input.next();
		
		System.out.printf("%s - what a beautiful name.\n", name);

		do {
			do {
				System.out.printf(
						"Please enter an integer between 1 and 100 (exclusive): \n");
				numbaEntered = input.nextInt();
			} while (!(numbaEntered > 1 && numbaEntered < 100));

			if (numbaEntered % 2 != 0) {
				if (numbaEntered > 60) {
					System.out.println(numbaEntered + " - Odd and over 60.");
				} else {
					System.out.println(numbaEntered + " - Odd.");
				}
			} else {
				if (numbaEntered >= 2 && numbaEntered <= 25) {
					System.out.println("Even and less than 25.");
				} else if (numbaEntered >= 26 && numbaEntered <= 60) {
					System.out.println("Even.");
				} else if (numbaEntered > 60) {
					System.out.println(numbaEntered + " - Even.");
				}
			}

			System.out.printf("Want to keep going, %s? Enter Y or N: ", name);
			ask = input.next();

		} while (ask.equals("Y"));
		
		if (!ask.equals("Y")) {
			System.out.println("Okay - bye!");
		}

	}
}
