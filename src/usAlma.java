import java.util.Scanner;
public class usAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,k,total = 1;
        System.out.print("taban değerini giriniz : ");
        n = inp.nextInt();

        System.out.print("üs değerini giriniz : ");
        k = inp.nextInt();

        for(int i = 1; i<=k; i++){
            total *=n;

        }
        System.out.println(total);
    }
}
