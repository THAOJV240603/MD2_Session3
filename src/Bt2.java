import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số phần tử của mảng: ");
        //Đổi mảng thành chuỗi
        int n = Integer.parseInt(scanner.nextLine());
        int[] a = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            //System.out.printf("a[%d] = ", i);
            a[i] = Integer.parseInt(scanner.nextLine());
        }

        //In mảng trước khi chèn phần tử k
        System.out.println("Mảng trước khi thêm phần tử: ");
        for (int i = 0; i < a.length; i++) {
            //System.out.print(a[i] + "\t");
            System.out.printf("%d\t ", a[i]);
        }

        //Xuống dòng
        System.out.printf("\n");

        System.out.println("Nhập vào vị trí muốn chèn: ");
        int vt = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số cần chèn: ");
        int k = Integer.parseInt(scanner.nextLine());

        //Khởi tạo mảng mới chứa cả phần tử mới
        int[] aNew = new int[a.length+1];

        //Copy phần tử ở mảng cũ và thêm phần tử mới vào mảng mới
        for (int i = 0; i < aNew.length; i++) {
            if(i<vt){
                aNew[i] = a[i];
            }else if(i == vt){
                aNew[i] = k;
            }else{
                aNew[i] = a[i-1];
            }
        }

        // Hiển thị các phần tử trong mảng sau khi thêm k
        System.out.println("Mảng sau khi thêm phần tử " + k + " là: ");
        for (int i = 0; i < aNew.length; i++) {
            //System.out.print(a[i] + "\t");
            System.out.printf("%d\t", aNew[i]);
        }

    }
}