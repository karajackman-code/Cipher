import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String output = "";
		// Read in String
		System.out.println("What is the message that you would like to encrypt?");
		String message = in.nextLine();
		// Read in how many columns
		System.out.println("How many columns do you want to encrypt with?");
		int colnum = in.nextInt();
		int num = 0;

		// break the String into columns
		for (int y = 0; y < colnum; y++) {
			for (int x = y; x < message.length(); x += colnum) {
				char letter = message.charAt(x);
				
				output+=letter;
			}
		}
		System.out.println(output);
		// Rewrite the message by reading the columns vertically
		// Print out the message
	}

}
