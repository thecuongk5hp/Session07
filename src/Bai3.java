import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap chuoi");
        String input = sc.nextLine();
        StringBuilder Sb = new StringBuilder(input);
        String reverseString = Sb.reverse().toString();
        System.out.println("chuoi ban dau\t" + input);
        System.out.println("chuoi sau khi dao nguoct\t" + reverseString);
        sc.close();
    }
}
