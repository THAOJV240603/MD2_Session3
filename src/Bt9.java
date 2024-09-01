import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Bt9 {
    public class EmailValidator {
        private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        public static boolean isValidEmail(String email) {
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
            return matcher.find();
        }
    }

    public class PasswordValidator {
        private static final Pattern VALID_PASSWORD_REGEX =
                Pattern.compile("^(?=\\S+$).{6,}$", Pattern.CASE_INSENSITIVE);
        //^ bắt đầu chuỗi
        //$ kết thúc chuỗi
        //(?=\S+$) không có khoảng trắng
        //.{6,20} lớn hơn 6 kí tự

        public static boolean isValidPassword(String password) {
            Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
            return matcher.find();
        }
    }

        public static void main(String[] args) {
            //String email = "example@example.com";
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập địa chỉ email: ");
            String email = scanner.nextLine();

            System.out.println("Nhập mật khẩu: ");
            String pass = scanner.nextLine();

            System.out.println(" ");
            if (EmailValidator.isValidEmail(email)) {
                System.out.println(email + " đúng định dạng");
            } else {
                System.out.println(email + " không đúng định dạng");
            }

            //String pass = "123 456";
            if (PasswordValidator.isValidPassword(pass)) {
                System.out.println(pass + " đúng định dạng");
            } else {
                System.out.println(pass + " không đúng định dạng");
            }
        }

}
