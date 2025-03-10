import java.util.Random;
import java.util.Scanner;

public class Bai8 {
    public static String createRandomString(int size) {
        Random randomGenerator = new Random();
        StringBuilder randomCharacters = new StringBuilder(size);
        for (int index = 0; index < size; index++) {
            int type = randomGenerator.nextInt(3);
            char currentChar;
            if (type == 0) {
                currentChar = (char) ('A' + randomGenerator.nextInt(26));
            } else if (type == 1) {
                currentChar = (char) ('a' + randomGenerator.nextInt(26));
            } else {
                currentChar = (char) ('0' + randomGenerator.nextInt(10));
            }
            randomCharacters.append(currentChar);
        }
        return randomCharacters.toString();
    }
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương n:");
        int n = inputScanner.nextInt();
        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            String generatedString = createRandomString(n);
            System.out.println("Chuỗi ngẫu nhiên: " + generatedString);
        }
        inputScanner.close();
    }
}