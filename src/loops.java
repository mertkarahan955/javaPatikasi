import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int girilenSayi,adet= 0,toplam= 0;
        double ortalama;

        System.out.print("Bir sayı giriniz: ");
        girilenSayi = inp.nextInt();

        for( int i = 1; i<= girilenSayi; i++){

                if(i % 12 == 0){

                    toplam +=i;
                    adet ++;


            }
        }

        ortalama = toplam/(adet);
        System.out.print("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması  :"+ortalama);
    }
}