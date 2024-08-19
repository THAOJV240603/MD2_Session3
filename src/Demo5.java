import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận: ");
        row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        col = sc.nextInt();

        //Khai báo mảng 2 chiều row col
        int[][] a = new int[row][col];

        //In ra menu
        do {
            System.out.println("========Menu========");
            System.out.println("1. Nhập vào các phần tử của mảng");
            System.out.println("2. Hiển thị các giá trị của phần tử trong mảng");
            System.out.println("3. Tính tổng các phần tử trong mảng");
            System.out.println("4. In ra các phần tử có giá trị chẵn trong mảng");
            System.out.println("5. Hiển thị các phần tử mảng dưới dạng ma trận");
            System.out.println("6. Tính tổng đường chéo chính");
            System.out.println("7. In ra đường biên");
            System.out.println("8. Thoát");
            System.out.println("Mời bạn chọn 1 --> 8");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //Nhập vào các phần tử của mảng
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("a[%d][%d] = ", i,j);
                            a[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    //Hiển thị các giá trị của phần tử trong mảng
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("a[%d][%d] = %d \n", i, j, a[i][j]);
                        }
                    }
                    //Xuống dòng
                    System.out.println(" ");
                    break;
                case 3:
                    //Tính tổng các phần tử trong mảng
                    int tong = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            tong += a[i][j];
                        }
                    }
                    System.out.println("Tổng các phần tử là: " +tong);
                    break;
                case 4:
                    //In ra các phần tử có giá trị chẵn trong mảng
                    System.out.println("Các phần tử có giá trị chẵn: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if(a[i][j] % 2 == 0){
                                System.out.println(a[i][j]);
                            }
                        }
                    }
                    break;
                case 5:
                    //Hiển thị các phần tử mảng dưới dạng ma trận
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("\t %d", a[i][j]);
                        }
                        //Xuống dòng
                        System.out.println(" ");
                    }
                    break;
                case 6:
                    //Tính tổng đường chéo chính
                    int tongCheo = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if(i == j){
                                tongCheo += a[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử trên đường chéo chính là: " +tongCheo);
                    break;
                case 7:
                    //In ra đường biên
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if(i == 0 || j == 0 || i == a.length-1 || j == a[i].length-1){
                                System.out.printf("\t %d", a[i][j]);
                            }else{
                                System.out.printf("\t %s", " ");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 8:
                        System.exit(0);
                default:
                    System.out.println("Sai lựa chọn, vui lòng chọn lại!");

            }
        }while (true);

    }
}
