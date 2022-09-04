import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int yil;

        System.out.print("Hesaplamak istediğiniz yılı giriniz : ");
        yil = inp.nextInt();

         if(yil %100 == 0){
             if(yil %400 == 0){
                 System.out.println("Artık yıl");
             }else{
                 System.out.println("Artık yıl değil");
             }
         }
         else if(yil %4 == 0){
             System.out.println("Artık yıl");
         }

    }
}
