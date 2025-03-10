import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 3 chuỗi cách nhau bằng dấu phẩy: ");
        String inputLine = scanner.nextLine();
        String[] parts = inputLine.split(",");
        StringBuilder builder = new StringBuilder();
        for (String part : parts) {
            builder.append(part.trim()).append(" ");
        }
        String resultString = builder.toString().toUpperCase();
        System.out.println("Chuỗi đã chuyển đổi sang chữ hoa: " + resultString);
        scanner.close();
    }
}