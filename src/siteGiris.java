
import java.util.Scanner;

public class siteGiris {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password, choice, newP, newU,secim;

        System.out.print("kullanıcı adınız  : ");
        userName = inp.nextLine();

        System.out.print("şifreniz  : ");
        password = inp.nextLine();

        if (userName.equals("mertkarahan955") && password.equals("sifre123")) {

            System.out.println("giriş başarılı sayfaya yönelndiriliyorsunuz!!");

        }
        else {
            if (!(userName.equals("mertkarahan955"))) {
                System.out.println("kullanıcı adınız yanlış");
                System.out.println("kullanıcı adınızı değiştirmek ister misiniz ? E/H");

                secim = inp.nextLine();
                   if(secim.equals("E")){
                       System.out.println("yeni kullanıcı adınızı girebilirsiniz");
                       newU = inp.nextLine();
                       if (newU.equals(newU) && password.equals("sifre123")) {
                           System.out.println("giriş doğru siteye yönlendiriliyorsunuz ");


                   }
                   else{
                       System.out.println("giriş için tekrar deneyiniz ");
                       System.out.println("kullanıcı adınızı giriniz : ");
                       userName = inp.nextLine();
                       System.out.println("şifreyi giriniz : ");
                       password = inp.nextLine();
                   }






                } else {
                    System.out.println("gene yanlış amk yeter  kafam karıştı");

                }

            } else if (!(password.equals("sifre123"))) {
                System.out.print("Şifreniz yanlış!! ");
                System.out.println("şifrenizi değiştirmek ister misiniz ? E/H ");
                choice = inp.nextLine();
                if (choice.equals("E")) {
                    System.out.print("yeni şifrenizi girebilirsiniz : ");
                    newP = inp.nextLine();
                    System.out.println("giriş için tekrar deneyebilirsiniz  ");
                    System.out.print("kullanıcı adınızı giriniz : ");
                    userName = inp.nextLine();
                    System.out.println("şifreinizi giriniz :");
                    newP = inp.nextLine();
                    if (userName.equals("mertkarahan955") && newP.equals(newP)) {
                        System.out.println("giriş başarılı siteye yönlendiriliyorsunuz");
                    } else {

                        System.out.println("düzgün gir artık şunu aq yeter daha da ileri gidemicem");
                    }

                } else if (choice.equals("H")) {

                    System.out.println("şifreni hatırla aq o zaman !!! ");
                } else {

                    System.out.println("yanlış tuşlama yaptınız e/h tuşlayınız!!");

                }


            }


        }
    }
}
