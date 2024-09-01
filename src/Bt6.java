import java.util.Scanner;
public class Bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ hai: ");
        String s2 = sc.nextLine();
        String s3 = s1.concat(" " + s2);
        System.out.println("Nối chuỗi thứ hai vào chuỗi thứ nhất: \n" + s3);
    }
}
