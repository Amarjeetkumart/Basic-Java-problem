package vac;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a binary number: ");
            String binary = scanner.nextLine();
            int decimal = binaryToDecimal(binary);
            System.out.println("Decimal equivalent: " + decimal);
        }
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0'; // Convert char to int
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}
