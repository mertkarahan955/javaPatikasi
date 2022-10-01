import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n;
        double result = 0.0;
        System.out.print("Sayi giriniz : ");
        n =inp.nextInt();

        for(int i = 1; i<=n; i++){
            result += 1.0/i;

        }
        System.out.println(result);


    }
}
