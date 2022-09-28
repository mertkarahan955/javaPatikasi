import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number,basValue,toplam = 0;
        System.out.println("Sayi giriniz : ");
        number = inp.nextInt();

        while(number != 0) {
            basValue= number % 10;
            toplam +=basValue;
            number /= 10;

        }
        System.out.println(toplam);



    }
}
