import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi = "Hello, Java World!";
        System.out.println("Chuoi ban dau: " + chuoi);
        String delete = chuoi.substring(0, 5) + chuoi.substring(9);
        String replace = delete.replace(" World", "Universe");
        System.out.println("Chuoi sau khi xoa" + delete);
        System.out.println("Chuoi sau khi thay the" + replace);
        sc.close();
    }
}
