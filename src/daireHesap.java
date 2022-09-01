import java.util.Scanner;

public class daireHesap {


    public static void main(String[] args) {

         double r, pi ;

          pi = 3.14;
          Scanner inp = new Scanner(System.in);

        System.out.println("dairenin yarıçapını girin : ");
        r  = inp.nextDouble();

        double daireCevresi = (r*2*pi);
        double daireAlan = (r*r*pi);

        System.out.println("dairenin alanı : " + daireAlan);
        System.out.println("dairenin çevresi : " +  daireCevresi);








    }
}
