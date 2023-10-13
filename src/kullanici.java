
import java.util.Scanner;
public class kullanici {
    public static void main(String[] args) {

        String userName, password;
        Scanner input =new Scanner(System.in);

        System.out.print("kullanıcı adını giriniz:");
        userName = input.nextLine();

        System.out.print("kullanıcı şifrenizi giriniz:");
        password =input.nextLine();

        if (userName.equals("patika")&& password.equals("java123")) {
            System.out.println("giriş yaptınız");
        } else{
            System.out.print("bilgileriniz hatalı");
        }

    }
}
