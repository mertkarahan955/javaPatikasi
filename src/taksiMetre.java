import java.util.Scanner;

public class taksiMetre {

    public static void main(String[] args) {
        System.out.println("açılış ücreti 10 tl dir");
        double gidilenMesafe;

        Scanner inp = new Scanner(System.in);
         double kacKm = 2.20 ;
        System.out.print("kaç km gittiğinizi belirtin : ");
         gidilenMesafe = inp.nextDouble();



         double toplamUcret =(kacKm*gidilenMesafe + 10 ) ;


         String str = (toplamUcret >= 20 ) ?  "Ödemenizi yapınız" : " min öndemesi gereken ücret 20 tl olduğu için 20 tl vermeniz gerekiyor.";

        System.out.println(toplamUcret);
        System.out.println(str);



    }

}
