import java.util.Scanner;


public class vkeHesaplama {
    public static void main(String[] args) {

       Scanner inp = new Scanner(System.in);
       float  kilo,boy ;

        System.out.print("kilonuzu kg cinsinden giriniz :  ");
        kilo  = inp.nextFloat();

        System.out.print("boyunuzu cm cinsinden giriniz : ");

         boy = inp.nextFloat();
         double  dogruBoy =(boy/100);
         double  hesap  =(kilo/(dogruBoy*dogruBoy));
        System.out.println("vücut kitle endeksiniz : " + hesap);






    }
}
