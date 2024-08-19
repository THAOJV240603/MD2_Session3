import java.util.Scanner;
public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số phần tử của mảng: ");
        //Đổi mảng thành chuỗi
        int n = Integer.parseInt(scanner.nextLine());
        int[] a = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            a[i] = Integer.parseInt(scanner.nextLine());
        }

        //In mảng trước khi xóa phần tử k
        System.out.println("Mảng trước khi xóa phần tử: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t ", a[i]);
        }

        //Xuống dòng
        System.out.printf("\n");

        System.out.println("Nhập phần tử có giá trị cần xóa k: ");
        int k = Integer.parseInt(scanner.nextLine());

        //Đếm số phần tử có giá trị là k trong mảng cũ
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                dem++;
            }
        }

        //Khởi tạo mảng mới với số phần tử là a.length - dem
        int[] aNew = new int[a.length-dem];

        //Copy phần tử không bị xóa từ mảng cũ sang mảng mới
        int vt = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == k) {
                //Đang ở phần tử cần xóa ở mảng cũ
                continue;
            }else{
                //Đang ở phần tử cần copy sang mảng mới
                aNew[vt] = a[i];
                vt++;
            }
        }

        // Hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng sau khi xóa phần tử " + k + " là: ");
        for (int i = 0; i < aNew.length; i++) {
            System.out.printf("%d\t", aNew[i]);
        }


    }
}

