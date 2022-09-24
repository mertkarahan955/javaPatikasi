import java.util.Scanner;
public class ders {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a;
        System.out.print("Sayi giriniz:");
        a = inp.nextInt();

        for(int i = 1; i<=a; i*=20) {
            if(i % 4 == 0 && i % 5 == 0){
                System.out.println("4 ve 5 in katı sayı : " + i);
            }
        }
    }
}