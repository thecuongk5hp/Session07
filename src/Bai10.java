import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int userChoice;

        do {
            System.out.println("====MENU QUẢN LÝ CHUỖI====");
            System.out.println("1. Nhập chuỗi ban đầu");
            System.out.println("2. Đảo ngược chuỗi");
            System.out.println("3. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("4. Xóa một đoạn trong chuỗi");
            System.out.println("5. Thay thế một đoạn trong chuỗi");
            System.out.println("6. Chuyển đổi toàn bộ chuỗi thành chữ hoa/chữ thường");
            System.out.println("7. Thoát chương trình");
            System.out.print("Chọn chức năng (1-7): ");
            userChoice = inputScanner.nextInt();
            inputScanner.nextLine(); // Đọc dòng mới

            switch (userChoice) {
                case 1:
                    System.out.print("Nhập chuỗi ban đầu: ");
                    String initialString = inputScanner.nextLine();
                    stringBuilder = new StringBuilder(initialString);
                    System.out.println("Chuỗi đã nhập: " + stringBuilder);
                    break;

                case 2:
                    System.out.println("Chuỗi đảo ngược: " + stringBuilder.reverse().toString());
                    break;

                case 3:
                    System.out.print("Nhập chuỗi con cần chèn: ");
                    String substringToInsert = inputScanner.nextLine();
                    System.out.print("Nhập vị trí chèn: ");
                    int insertPosition = inputScanner.nextInt();
                    if (insertPosition >= 0 && insertPosition <= stringBuilder.length()) {
                        stringBuilder.insert(insertPosition, substringToInsert);
                        System.out.println("Chuỗi sau khi chèn: " + stringBuilder);
                    } else {
                        System.err.println("Vị trí không hợp lệ.");
                    }
                    break;

                case 4:
                    System.out.print("Nhập vị trí bắt đầu: ");
                    int startPosition = inputScanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc: ");
                    int endPosition = inputScanner.nextInt();
                    if (startPosition >= 0 && endPosition <= stringBuilder.length() && startPosition < endPosition) {
                        stringBuilder.delete(startPosition, endPosition);
                        System.out.println("Chuỗi sau khi xóa: " + stringBuilder);
                    } else {
                        System.err.println("Vị trí không hợp lệ.");
                    }
                    break;

                case 5:
                    System.out.print("Nhập vị trí bắt đầu thay thế: ");
                    int replaceStart = inputScanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc thay thế: ");
                    int replaceEnd = inputScanner.nextInt();
                    inputScanner.nextLine(); // Đọc dòng mới
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replacementString = inputScanner.nextLine();
                    if (replaceStart >= 0 && replaceEnd <= stringBuilder.length() && replaceStart < replaceEnd) {
                        stringBuilder.replace(replaceStart, replaceEnd, replacementString);
                        System.out.println("Chuỗi sau khi thay thế: " + stringBuilder);
                    } else {
                        System.err.println("Vị trí không hợp lệ.");
                    }
                    break;

                case 6:
                    System.out.println("Chọn loại chuyển đổi:");
                    System.out.println("1. Chuyển thành chữ hoa");
                    System.out.println("2. Chuyển thành chữ thường");
                    int convertChoice = inputScanner.nextInt();
                    if (convertChoice == 1) {
                        System.out.println("Chuỗi chữ hoa: " + stringBuilder.toString().toUpperCase());
                    } else if (convertChoice == 2) {
                        System.out.println("Chuỗi chữ thường: " + stringBuilder.toString().toLowerCase());
                    } else {
                        System.err.println("Lựa chọn không hợp lệ.");
                    }
                    break;

                case 7:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.err.println("Mời bạn chọn từ 1-7.");
            }
        } while (userChoice != 7);

        inputScanner.close();
    }
}