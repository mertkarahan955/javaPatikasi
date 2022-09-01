/*  sayılar girilsin ve sayıların hangi dataya ( byte<short<int<long) sığabileceği output olsun.
      byte = -128 ve 127
      short = -32.768 ve 32.767
      integer = -2.147.483.648 ve2.147.483.647
      long -9,223,372,036,854,775,808 ve 9.223.372.036.854.775.807    */

import java.util.Scanner;

public class deneme {
     public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         System.out.print("give the value for t  : ");
          int t = inp.nextInt();


          String t1 = (-128<t) && (t<127) ? "t can be fitted  in byte,short,int,long" : "t can't be  fit byte ";
          String t2 = (-32768<t) && (t<32.767) ? "t can be fitted in short, int, long" : "t can't be  fit byte and short";
          String t3 = (-2147483648<t) && (t<2147483647) ? "t can be fitted in int and long" : "t can't be  fit byte, short and int";
          String t4 = (t <= Math.pow(2,63) - 1)&&(t >= Math.pow(-2, 63)) ? "t can be fitted in long" : "t can't be fitted anywhere.";

         System.out.println(t1);
         System.out.println(t2);
         System.out.println(t3);
         System.out.println(t4);






    }
}
