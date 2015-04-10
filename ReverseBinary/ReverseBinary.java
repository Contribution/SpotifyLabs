import java.util.Scanner;

public class ReverseBinary {
	public static void main(String[] args) {
		// for obtaining an integer from the user
		Scanner scan = new Scanner(System.in);
		int integerInput;
		// input and input validation
		do {

			while (!scan.hasNextInt()) {
				System.out.println("Something that was not an integer has been entered.");
				scan.next();
			}

			integerInput = scan.nextInt();

		} while (integerInput <= 0 || integerInput > 1000000000);

		scan.close();
		// conversion methods
		String inputToBinary = convertToBinary(integerInput);
		String reversedBinary = reverseBinary(inputToBinary);
		int reversedToDecimal = reversedBinaryToDecimal(reversedBinary);

		System.out.println(reversedToDecimal);
	}

	/**
	 * 
	 * @param input
	 *            A base 10 number to be converted to base 2.
	 * @return The base 10 number converted to base 2.
	 */
	private static String convertToBinary(int input) {
		if (input <= 1) {
			return "1";
		} else {					
			return convertToBinary(input / 2) + (input % 2);
		}		
	}

	/**
	 * 
	 * @param binaryString
	 *            A String representation of a binary value.
	 * @return A reversal of the String argument.
	 */
	private static String reverseBinary(String binaryString) {
		String reversed = "";
		for (int i = binaryString.length() - 1; i >= 0; i--) {
			reversed += binaryString.charAt(i);
		}
		return reversed;
	}

	/**
	 * 
	 * @param reversedBinaryString
	 *            A String representation of a reversed binary value.
	 * @return The reversed base 2 number converted to base 10.
	 */
	private static int reversedBinaryToDecimal(String reversedBinaryString) {
		int total = 0;
		for (int i = 0; i < reversedBinaryString.length(); i++) {
			// ensures the value extracted from the string is not a unicode
			// value
			total = (total * 2) + Character.getNumericValue(reversedBinaryString.charAt(i));
		}
		return total;
	}
	
}
