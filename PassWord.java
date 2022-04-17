import java.util.Scanner;
public class PassWord {
    public static void main(String[] args) {
        String userName, passWord, control, newpassWord;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı Adını Giriniz:");
        userName = inp.nextLine();
        System.out.println("Şifrenizi Giriniz:");
        passWord = inp.nextLine();
        if (userName.equals("patika") && passWord.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        }else{
            System.out.println("Hatalı Giriş Yaptınız Şifrenizi Sıfırlamak İstiyorsanız Lütfen e tuşuna basınız :");
            control = inp.nextLine();
            if (control.equals("E")|| control.equals(("e"))){
                System.out.println("Yeni şifre giriniz:");
                newpassWord = inp.nextLine();
                if (newpassWord.equals("java123")) {
                    System.out.println("Şifreniz önceki şifre ile aynı olamaz tekrar deneyin");
                }else{
                    System.out.println("şifre oluşturuldu");
                }
            }



        }
    }
}

