import java.util.Scanner;
public class aaa {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı girini :");
         int n = inp.nextInt();

        for(int i = 0;  i <= n; i++){
            for (int k = 1; k<= ( n-i); k++){
                System.out.print(" ");
            }

           for(int j= 1; j <=2*i +1; j ++){
               System.out.print("*");
           }
            System.out.println(" ");
        }

    }


}
