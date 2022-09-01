import java.util.Scanner;

public class ortalamaYapmaProgramı {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp =  new Scanner(System.in);

        System.out.print("matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("fizik notunu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("kimya notunu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("türkçe notunu giriniz:");
        turkce = inp.nextInt();

        System.out.print("tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

       int  toplam  = (mat + fizik + kimya + turkce + tarih + muzik );
       double sonuc = toplam/6;
       int gecmeNotu = 50;
         System.out.print("ortalamanız: " +  sonuc);


           









       }
}