package KullaniciGiris;

import java.util.Scanner;

public class Kullanici {
    public static void main(String[] args) {
        String userName, password, select, newPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        userName = input.nextLine();
        System.out.print("Şifre:");
        password = input.nextLine();

        if (userName.equals("java") && password.equals("patika")) {
            System.out.println("Giriş Başarılı!");


        } else System.out.println("Giriş bilgileri hatalı !");


        System.out.println("Şifrenizi unuttuysanız adımları takip edin\n Yeni şifre oluşturmak için : 'E' .\n Yeni Şifre oluşturmaktan vazgeçmek ve giriş ekranından ayrılmak için:'H'.");
        System.out.print(" Seçiminiz: ");
        select = input.nextLine();

        if (select.equals("E") || select.equals("e")) {
            System.out.print("Yeni şifre giriniz .(Lütfen daha önceki şifrelerinizden farklı bir şifre oluşturunuz:");
            newPassword = input.nextLine();
            if (!newPassword.equals("patika")) {
                System.out.println("Yeni şifre başarıyla oluşturuldu!");

            } else {
                System.out.println("Yeni şifre eskisiyle aynı olamaz, tekrar deneyiniz.");


            }
        } else if (select.equals("H") || select.equals("h")) {
            System.out.print("kullanıcı giriş sayfanda ayrılıyorsunuz ... iyi günler .");
            // kullanıcı E ve H dışında hatalı tercih yaparsa
        } else {
            System.out.print("Hatalı giriş yaptınız!! Lütfen sadece 'E ve H' seçeneklerinden birini giriniz.");
        }
    }

}
