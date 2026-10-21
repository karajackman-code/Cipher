import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String output = "";
		// Read in message
		System.out.println("Enter message:");
		String message = in.nextLine();
		// Read in shift
		System.out.println("Enter shift letter:");
		char shift = in.nextLine().toUpperCase().charAt(0);
		int numshift = (int) (shift - 'A');
		// Loop through message
		for (int x = 0; x < message.length(); x++) {
			char letter = message.charAt(x);
			if (Character.isAlphabetic(letter)) {
				if (Character.isUpperCase(letter)) {
					letter = (char) ((int) letter + numshift);
					if (letter > 'Z') {
						letter = (char) ((int) letter - 26);
					}
				} else {
					if (Character.isAlphabetic(letter)) {
						if (Character.isUpperCase(letter)) {
							letter = (char) ((int) letter + numshift);
							if (letter > 'z') {
								letter = (char) ((int) letter - 26);
							}
						}
					}
				}
			}
			output += letter;
		}
		System.out.println(output);
	}
}
