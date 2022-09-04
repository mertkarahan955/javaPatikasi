import java.util.Scanner;

public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int yas, flightType;
        double km, ilkUcret;

        System.out.print("yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("kaç kmlik uçuş yaptığınızı yazın");
        km = inp.nextInt();

        System.out.println("Yolculuk şeklini seçininiz 1/2 : ");
        flightType = inp.nextInt();

        ilkUcret = (km * 0.10);
        System.out.println("İndirimsiz ücretiniz : " + ilkUcret);

        if (flightType == 1) {
            if (yas <= 12) {
                System.out.print("Çocuk  bilet ücreti : " + ilkUcret * 0.5);
            } else if (yas <= 24 && yas > 12) {
                System.out.println("Genç bilet ücreti : " + ilkUcret * 0.9);
            } else if (yas >= 65) {
                System.out.println("Yaşlı bilet ücreti : " + ilkUcret * 0.7);
            } else {
                System.out.println("Bilette indirim yok bilet fiyatınız aynı : " + ilkUcret);

            }
        } else if (flightType == 2) {
            if (yas <= 12) {
                System.out.print("Çocuk  bilet ücreti : " + ilkUcret * 0.5*0.8);
            } else if (yas <= 24 && yas > 12) {
                System.out.println("Genç bilet ücreti : " + ilkUcret * 0.9*0.8);
            } else if (yas >= 65) {
                System.out.println("Yaşlı bilet ücreti : " + ilkUcret * 0.7*0.8);
            } else {
                System.out.println("Normal gidiş dönüş tarifleri ücret  : " + ilkUcret*0.8);


            }


        }
    }
}