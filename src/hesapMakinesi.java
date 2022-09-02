import java.util.Scanner;

public class hesapMakinesi {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n1,n2,choose;

        System.out.print("ilk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        System.out.println("hangi işlemi yapmak istediğinizi seçin\n 1-toplama\n 2-çıkarma\n 3-çarpma\n 4-bölme");
        System.out.print("seçiminiz :  " );
        choose = inp.nextInt();

         switch (choose){
             case 1:
                 System.out.println("sonucunuz: " + (n1 + n2 ));
                 break;
             case 2:
                 System.out.println("sonucunuz : " +  (n1- n2));
                 break;
             case 3 :
                 System.out.println("sonucunuz : "+ n1 * n2);
                 break;
             case 4 :
                 System.out.println("sonucunuz : " + n1 / n2 );
                 break;
             default:
                 System.out.println("ERROR");
                 break;






         }

















    }
}
