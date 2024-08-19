public class Demo {
    public static void main(String[] args) {
        //khai báo mảng 1 chiều
        //khai báo mảng 1 chiều chuawas 5 phần tử có kiểu dữ liệu là int
        int[] array = new int[5];
        //khai báo mảng 1 chiều có 5 phần tử kiểu int gán giá trị cho 5 phần tử
        int[] array01 = {3,5,6,7,9};

        //Truy cập các phần tử của mảng
        //Th1: Truy xuất để lấy ra giá trị thông qua chỉ mục của mảng
        System.out.println("GT của phần tử thứ 1 của mảng array01 " + array01[0]);
        System.out.println("GT của phần tử thứ 2 của mảng array01 " + array01[1]);
        System.out.println("GT của phần tử thứ 3 của mảng array01 " + array01[2]);

        //Th2: Truy xuất để gán giá trị của các phần tử trong mảng thông chi mục
        array[0] = 8;
        //array[1] = "Hihi"; //Sai, vì kiểu dữ liệu của mảng là int
        array[1] = 10;
        array[2] = 7;
        array[3] = 9;
        array[4] = 10;

        System.out.println("Giá trị của phần tử thứ nhất trong mảng array " + array[0]);

        //Sử dụng mảng duyệt các phần tử của mảng
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
