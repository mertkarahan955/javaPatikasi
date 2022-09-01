import  java.util.Scanner;


public class hipotenusBulma {

    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);
        System.out.print("birinci  kenarı  giriniz: ");
         a = inp.nextInt();
        System.out.print("ikinci kenarı giriniz: ");
        b = inp.nextInt();
        double birinciKenar = Math.pow(a,2);
        double ikinciKenar = Math.pow(b,2);

        double hipotenus = (birinciKenar + ikinciKenar);

         double sonuc = Math.sqrt(hipotenus);




        System.out.println("hipotenüs uzunluğu: " + sonuc );



    }
}
