import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        //Khai báo mảng có n phần tử, n nhập từ bàn phím
        //Nhập các giá trị khác nhau cho mảng
        //Hiển thị các giá trị của các phần tử mảng

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = sc.nextInt();

        //Khai báo mảng có n phần tử
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        //Hiển thị các giá trị của phần tử mảng
        System.out.println("Các giá trị của mảng: ");
        for (int i = 0; i < n; i++) {
            //in có định dạng
            System.out.printf("Phần tử thứ %d = %d \n", i+1, a[i]);
        }
    }
}
