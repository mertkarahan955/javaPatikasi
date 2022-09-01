import java.util.Scanner;


public class manavKasaProgrami {

    public static void main(String[] args)  {

        Scanner inp = new Scanner(System.in);

         double armutFiyat,elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat;
         double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
         double toplamArmut,toplamElma,toplamDomates,toplamMuz,toplamPatlican;
         double toplamTutar;
         armutFiyat = 2.14;
         elmaFiyat = 3.67;
         domatesFiyat = 1.11;
         muzFiyat = 0.95 ;
         patlicanFiyat = 5 ;

         System.out.print(" kaç kilo armut alacağınızı yazın :  ");
         armutKilo = inp.nextDouble();
         System.out.print(" kaç kilo elma alacağınızı yazın :  ");
         elmaKilo = inp.nextDouble();
         System.out.print(" kaç kilo domates alacağınızı yazın :  ");
         domatesKilo = inp.nextDouble();
         System.out.print(" kaç kilo muz alacağınızı yazın :  ");
         muzKilo = inp.nextDouble();
         System.out.print(" kaç kilo patlıcan alacağınızı yazın :  ");
         patlicanKilo = inp.nextDouble();;

          toplamArmut = (armutKilo*armutKilo);
          toplamElma = (elmaFiyat*elmaKilo);
          toplamDomates = (domatesFiyat*domatesKilo);
          toplamMuz = (muzFiyat*muzKilo);
          toplamPatlican = (patlicanFiyat*patlicanKilo);
          toplamTutar = (toplamArmut + toplamDomates + toplamElma + toplamMuz + toplamPatlican);
         System.out.println(" toplam tutar : " + toplamTutar);









    }


}
