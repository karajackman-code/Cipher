import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String output = "";
		// Read in message
		System.out.println("Enter message:");
		String message = in.nextLine();
		// Read in shift
		System.out.println("Enter shift word:");
		String shiftwrd = in.nextLine();
		int numshift = 0;
		int pos = 1;
		// Loop through message
		for (int x = 0; x < message.length(); x++) {
			char letter = message.charAt(x);
			char shift = shiftwrd.toUpperCase().charAt(pos);
			pos = pos + 1;
			pos %= shiftwrd.length();
			if (Character.isAlphabetic(letter)) {
				if (Character.isUpperCase(letter)) {
					numshift = (int) (shift - 'A');
					letter = (char) ((int) letter + numshift);
					if (letter > 'Z') {
						letter = (char) ((int) letter - 26);
					}
				} else {
					if (Character.isLowerCase(letter)) {
						numshift = (int) (shift - 'A');
						letter = (char) ((int) letter + numshift);
						if (letter > 'z') {
							letter = (char) ((int) letter - 26);
						}
					}
				}
			}
			output += letter;
		}
		System.out.println(output);
		// Read in message

		// Read in shift word

		// Loop through message
		// if letter is alphabetic
		// apply shift from the current letter
		// move to the next shift letter, loop back to the beginning if necessary
		// if letter is past 'Z'
		// subtract 26
		// add letter to output

		// print output
	}

}
