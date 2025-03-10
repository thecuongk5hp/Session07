import java.util.Scanner;

public class Bai7 {

    public static String transformCase(String original) {
        if (original == null || original.isEmpty()) {
            return "";
        }
        StringBuilder transformed = new StringBuilder();
        boolean isPascal = Character.isUpperCase(original.charAt(0));
        for (int index = 0; index < original.length(); index++) {
            char currentCharacter = original.charAt(index);
            if (Character.isUpperCase(currentCharacter)) {
                if (index > 0 || isPascal) {
                    transformed.append('_');
                }
                transformed.append(Character.toLowerCase(currentCharacter));
            } else {
                transformed.append(currentCharacter);
            }
        }
        return transformed.toString();
    }
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi có định dạng PascalCase hoặc camelCase:");
        String userInput = inputScanner.nextLine();
        String result = transformCase(userInput);
        System.out.println("Chuỗi chuyển đổi: " + result);
        inputScanner.close();
    }
}