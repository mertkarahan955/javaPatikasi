/* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
 girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz. */
import java.util.Scanner;
 public class tekSayi {
     public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);

         int n,total = 0;

         do{
             System.out.print("Sayi giriniz: ");
                n = inp.nextInt();
                if( n% 4 == 0) {

                    total = +n;
                }

         }while(n>0);

         System.out.println("Toplam : " + total);

     }
}