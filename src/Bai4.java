import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap chuoi");
        String input = sc.nextLine();
        String convert = input.toLowerCase();
        String reverse = new StringBuilder(convert).reverse().toString();
        if (convert.equals(reverse)) {
            System.out.println("Chuoi doi xung");
        } else {
            System.out.println("Chuoi khong doi xung");
        }
        sc.close();
    }
}
