import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        StringBuilder mainString = new StringBuilder();
        System.out.print("Nhập chuỗi bất kỳ: ");
        mainString.append(userInput.nextLine());
        int actionChoice;
        do {
            // Hiển thị menu
            System.out.println("\n===== MENU QUẢN LÝ CHUỖI =====");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi toàn bộ chuỗi thành chữ hoa/chữ thường");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng (1-6): ");

            actionChoice = userInput.nextInt();
            userInput.nextLine();

            switch (actionChoice) {
                case 1:
                    mainString.reverse();
                    System.out.println("Chuỗi sau khi đảo ngược: " + mainString);
                    break;
                case 2:
                    System.out.print("Nhập chuỗi con cần chèn: ");
                    String insertString = userInput.nextLine();
                    System.out.print("Nhập vị trí cần chèn: ");
                    int insertIndex = userInput.nextInt();
                    userInput.nextLine();
                    if (insertIndex >= 0 && insertIndex <= mainString.length()) {
                        mainString.insert(insertIndex, insertString);
                        System.out.println("Chuỗi sau khi chèn: " + mainString);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 3:
                    System.out.print("Nhập vị trí bắt đầu xóa: ");
                    int deleteStart = userInput.nextInt();
                    System.out.print("Nhập vị trí kết thúc xóa: ");
                    int deleteEnd = userInput.nextInt();
                    userInput.nextLine();
                    if (deleteStart >= 0 && deleteEnd <= mainString.length() && deleteStart < deleteEnd) {
                        mainString.delete(deleteStart, deleteEnd);
                        System.out.println("Chuỗi sau khi xóa: " + mainString);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 4:
                    System.out.print("Nhập vị trí bắt đầu thay thế: ");
                    int replaceStart = userInput.nextInt();
                    System.out.print("Nhập vị trí kết thúc thay thế: ");
                    int replaceEnd = userInput.nextInt();
                    userInput.nextLine();
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replacementString = userInput.nextLine();
                    if (replaceStart >= 0 && replaceEnd <= mainString.length() && replaceStart < replaceEnd) {
                        mainString.replace(replaceStart, replaceEnd, replacementString);
                        System.out.println("Chuỗi sau khi thay thế: " + mainString);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 5:
                    System.out.println("1 là hoa / 2 là thường: ");
                    int caseChoice = userInput.nextInt();
                    userInput.nextLine();
                    if (caseChoice == 1) {
                        mainString = new StringBuilder(mainString.toString().toUpperCase());
                        System.out.println("Chuỗi sau khi chuyển thành chữ hoa: " + mainString);
                    } else if (caseChoice == 2) {
                        mainString = new StringBuilder(mainString.toString().toLowerCase());
                        System.out.println("Chuỗi sau khi chuyển thành chữ thường: " + mainString);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }
        } while (true);

        userInput.close();
    }
}
