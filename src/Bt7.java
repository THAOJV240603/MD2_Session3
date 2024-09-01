import java.util.Scanner;
public class Bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ nhất: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi thứ hai: ");
        String s2 = sc.nextLine();
        //System.out.println(s1.contains(s2));
        if (s1.contains(s2) == false) {
            System.out.println("Chuỗi thứ nhất không chứa chuỗi thứ hai");
        }
        else{
            System.out.println("Chuỗi thứ nhất có chứa chuỗi thứ hai");
        }
    }
}
