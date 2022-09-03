import java.util.Scanner ;

public class havaSicakligi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int birinci,ikinci,ucuncu,dorduncu;
         double havaSicakligi;
        System.out.print("hava sıcaklığını giriniz: ");
        havaSicakligi = inp.nextDouble();
         birinci = 5;
         ikinci = 15;
         ucuncu = 25;
         dorduncu = 50;
         if(havaSicakligi<=5){
             System.out.print("hava sıcaklığı 5 derecenin altında olduğundan kayak yapabilirsin ");
         }
         else if(havaSicakligi>5 && havaSicakligi<15 ){
             System.out.println("hava sıcaklığı 15 derecenin altında  sinemaya gidilebilir ");

         }
         else if(havaSicakligi>15 && havaSicakligi<25){
             System.out.println("hava sıcaklığı 25 derecenin altında piknik yapılabilir  ");


         }else if(havaSicakligi>25 ){

             System.out.println("hava 25 dereceden yukarıda yüzmeye gidilebilir.");
         }


    }
}
