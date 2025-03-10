import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String userInput = inputScanner.nextLine();
        String cleanedString = userInput.trim().replaceAll("\\s+", " ");
        String[] wordArray = cleanedString.split(" ");
        StringBuilder reversedOrder = new StringBuilder();
        for (int i = wordArray.length - 1; i >= 0; i--) {
            reversedOrder.append(wordArray[i]).append(" ");
        }
        String finalResult = reversedOrder.toString().trim();
        System.out.println("Câu mới sau khi xử lý: " + finalResult);
        inputScanner.close();
    }
}