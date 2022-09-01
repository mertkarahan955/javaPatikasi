import java.util.Scanner;


public class kdvHesaplamasi {
// kdv  tutarı %18 olacak

    public static void main(String[] args) {

        double urun1;
        Scanner inp = new  Scanner(System.in);
        System.out.print("kdv hesaplamak için urun1 fiyatını giriniz: ");
        urun1 = inp.nextDouble();

        double  islem = (urun1<= 1000 ) ?    urun1*118/100  : urun1*108/100 ;
        double tutar = (urun1 <=1000) ?     urun1*18/100  : urun1*8/100 ;

        System.out.println("kdvli tutarınız: " + islem);
        System.out.println("kdv tutaro : " + tutar);















    }

}
