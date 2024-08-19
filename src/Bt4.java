import java.util.Scanner;
public class Bt4 {
    public static void main(String[] args) {
        //Khai báo và khởi tạo gia trị cho mảng 2 chiều số thực
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận: ");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        int col = sc.nextInt();
        float[][] a = new float[row][col];
        System.out.println("Nhập vào các phần tử của mảng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("a[%d][%d] = ", i,j);
                a[i][j] = sc.nextFloat();
            }
        }
        //Xuống dòng
        System.out.println(" ");

        //Hiển thị các giá trị của phần tử trong mảng số thực
        System.out.println("Mảng đã nhập vào là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("a[%d][%d] = %.2f \n", i, j, a[i][j]);
            }
        }
        //Xuống dòng
        System.out.println(" ");

        //Tìm phần tử có giá trị lớn nhất
        float max = a[0][0];
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        //Duyệt mảng 2 chiều, in ra tọa độ, giá trị của phần tử có giá trị = max
        System.out.println("Tọa độ và giá trị các phần tử có giá trị lớn nhất: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == max) {
                    System.out.printf("Tọa độ: [%d][%d] \nGiá trị: %.2f\n", i, j, max, a[i][j]);
                }
            }
        }

    }
}
