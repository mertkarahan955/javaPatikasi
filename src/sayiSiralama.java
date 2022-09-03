import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {

       Scanner inp = new Scanner(System.in);

        int a,b,c;

        System.out.print("ilk sayıyı giriniz : ");
        a = inp.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        b = inp.nextInt();
        System.out.print("üçüncü sayıyı giriniz : ");
        c = inp.nextInt();

         if(a<b && a<c){
             System.out.println("en küçük sayı a dır ");
             if(b<c){
                 System.out.println("sayıların sıralaması a < b < c 'dir.");
             }
             else{
                 System.out.println("sayıların sıralaması a<c<b");
             }
         }else if(b<a && b<c){
             System.out.println("b en küçük sayıdır");
             if(a<c){
                 System.out.println("sayıların sıralaması b<a<c");
             }else{
                 System.out.println("sayıların sıralaması b<c<a");
             }
         }
         else if(c<a && c<b){
             System.out.println("en küçük sayı c dir");
             if(a<b){
                 System.out.println("sayıların sıralaması c<a<b");
             }
             else{
                 System.out.println("sayıların sıralaması c<b<a");
             }

         }


    }


}
