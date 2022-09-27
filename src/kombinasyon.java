import java.util.Scanner;


public class kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // n! / (r! * (n-r)!)
        int c,n,r,totaln = 1,totalr = 1,totalend = 1;

        System.out.print("n değerini giriniz : ");
        n = inp.nextInt();

        System.out.print("r değerini giriniz : ");
        r = inp.nextInt();

        for(int i = 1; i <=n; i++){
                totaln  = totaln * i;
        }

        for(int j =1; j<=r; j++){
            totalr = totalr * j;

        }
        for (int a =1; a<=(n-r); a++){
            totalend = totalend * a;

        }
        c = totaln / (totalr * totalend);
        System.out.println(c);
    }
}
