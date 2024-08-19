import java.util.Scanner;
public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mảng 1
        System.out.println("Nhập vào số phần tử của mảng 1: ");
        //Đổi mảng thành chuỗi
        int n1 = Integer.parseInt(scanner.nextLine());
        int[] a = new int[n1];

        System.out.println("Nhập các phần tử cho mảng 1: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            a[i] = Integer.parseInt(scanner.nextLine());
        }

        //Mảng 2
        System.out.println("Nhập vào số phần tử của mảng 2: ");
        //Đổi mảng thành chuỗi
        int n2 = Integer.parseInt(scanner.nextLine());
        int[] b = new int[n2];

        System.out.println("Nhập các phần tử cho mảng 2: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            b[i] = Integer.parseInt(scanner.nextLine());
        }

        //In 2 mảng trước khi gộp
        System.out.println("Mảng 1 trước khi gộp: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t ", a[i]);
        }

        System.out.printf("\n");

        System.out.println("Mảng 2 trước khi gộp: ");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%d\t ", b[i]);
        }

        System.out.printf("\n");

        //biến length sẽ bằng độ dài của hai mảng cộng lại
        int length = a.length + b.length;

        //Khai báo thêm một mảng mới c để lưu trữ hai mảng cần nối, với độ dài bằng length
        int[] c = new int[length];
        int vt = 0;
        //Sử dụng vòng lặp for để lưu các phần tử trong mảng a vào mảng c
        for (int i = 0; i < a.length; i++) {
            c[vt] = a[i];
            vt++;
        }
        //Sử dụng vòng lặp for để lưu các phần tử trong mảng b vào mảng c
        for (int i = 0; i < b.length; i++) {
            c[vt] = b[i];
            vt++;
        }

        //Hiển thị mảng đã gộp c ra màn hình
        System.out.println("Mảng sau khi gộp là: ");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%d\t", c[i]);
        }
    }
}
