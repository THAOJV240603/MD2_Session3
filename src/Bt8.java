import java.util.Scanner;
public class Bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String s = sc.nextLine();
        //System.out.println("Chuỗi sau khi đã loại bỏ khoảng trắng ở 2 đầu: " + s.trim());
        System.out.println(s);
        System.out.println(s + "chưa loại bỏ");
        System.out.println(s.trim() + "đã loại bỏ");
    }
}
