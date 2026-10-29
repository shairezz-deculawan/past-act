import java.util.Scanner;

public class Password1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		String S1 = "Computer";
		String S2 = "Science";

		System.out.print("Account Name: ");
		String accountName = input.nextLine();

		System.out.print("Password: ");
		String password = input.nextLine();

		if (accountName.equals(S1) && password.equals(S2)) {
			System.out.println("Welcome to Java computer programming! ");
		} else {
			System.out.println("Wrong Entry! ");
		}

		System.out.println("Length of S1: " + S1.length());
		System.out.println("Length of S2: " + S2.length());

		String combined = S1.concat(S2);
		System.out.println("Concatenated String: " + combined);

		if (S1.equals(S2)) {
			System.out.println("Welcome to Java computer programming! ");
		} else {
				System.out.println("S1 and S2 are not equal ");
		}

		System.out.println("S1 equals S2 (ignore case): " + S1.equalsIgnoreCase(S2));
		System.out.println("S2 contains 'e': " + S2.contains ("e"));
		System.out.println("Substring of S1 (1,5): " + S1.substring (1,5));
		System.out.println("S1 replace 'o' with 'u': " + S1.replace ('o','u'));

		input.close();
	}
}