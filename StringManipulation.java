import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = new String(scanner.nextLine());
        System.out.println("Created String: " + str1);

        int length = str1.length();
        System.out.println("Length of String: " + length);

        System.out.print("Enter a string to concatenate: ");
        String str2 = scanner.nextLine();
        String concatenatedStr = str1.concat(" " + str2);
        System.out.println("Concatenated String: " + concatenatedStr);

        System.out.print("Enter index to extract character: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < str1.length()) {
            char extractedChar = str1.charAt(index);
            System.out.println("Character at index " + index + ": " + extractedChar);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.nextLine();

        System.out.print("Enter another string to compare: ");
        String str3 = scanner.nextLine();
        if (str1.equals(str3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.print("Enter substring to search: ");
        String subStr = scanner.nextLine();
        int position = str1.indexOf(subStr);
        if (position != -1) {
            System.out.println("Substring found at index: " + position);
        } else {
            System.out.println("Substring not found");
        }

        String upperCaseStr = str1.toUpperCase();
        String lowerCaseStr = str1.toLowerCase();
        String replacedStr = str1.replace("World", "Java");
        System.out.println("Uppercase: " + upperCaseStr);
        System.out.println("Lowercase: " + lowerCaseStr);
        System.out.println("Replaced String: " + replacedStr);

        System.out.print("Enter an integer to convert to string: ");
        int num = scanner.nextInt();
        System.out.print("Enter a double to convert to string: ");
        double decimal = scanner.nextDouble();
        String numStr = String.valueOf(num);
        String decimalStr = String.valueOf(decimal);
        System.out.println("Integer to String: " + numStr);
        System.out.println("Double to String: " + decimalStr);

        scanner.close();
    }
}
