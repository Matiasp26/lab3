import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String originalStr;
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);
        originalStr = myObj.nextLine();

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
}