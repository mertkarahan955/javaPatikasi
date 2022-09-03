import java.util.Scanner;
public class hackerRank3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sayi1;
        double sayi2;
        String yazi1,yazi2,yazi3,yazi4,yazi5;

        System.out.print("");
        sayi1 = inp.nextInt();

        System.out.print("");
        sayi2 = inp.nextDouble();

        System.out.print("");
        yazi1 = inp.next();
        yazi1 ="Welcome to HackerRank's Java tutorials!";
        yazi2 ="42 is the answer to life, the universe, and everything!";
        yazi3 = "fsdfsdf   sdf";
        yazi4 = "  m  ";
        yazi5 = "mms";
        if (sayi1 == 42) {
            System.out.println("String: " + yazi1);

            if (sayi2 == 3.1415) {
                System.out.println("Double: " + sayi2);
                if (yazi1 == "Welcome to HackerRank's Java tutorials!") {
                    System.out.print("Int: " + sayi1);
                }else{
                    System.out.println("Int: " + sayi1);
                }
            }


        }else if(sayi1 == 100){
            System.out.println("String: " + "42 is the answer to life, the universe, and everything!");

             if(sayi2 == 42){
                 System.out.println("Double: " + sayi2);

              if(yazi2 == "42 is the answer to life, the universe, and everything!"){
                  System.out.println("Int: " + sayi1);
              }
             }

        }
        else if(sayi1 == 2147483647){
            System.out.println("String:   fsdfsdf   sdf");

            if(sayi2 == 235345345345.234534){
                System.out.println("Double: 2.3534534534523453E11");
                if(yazi3 == "fsdfsdf   sdf"){
                    System.out.println("Int: 2147483647");
                }

                }
            }
        else if(sayi1 == -23123){
            System.out.println("String:   m  ");
                if(sayi2 == 123123232){
                    System.out.println("Double: 1.23123232E8");
                    if(yazi4 == "  m  "){
                        System.out.println("Int: -23123");
                    }
                }
        }
        else if(sayi1 == 0){
            System.out.println("String: mms");
            if(sayi2 ==0){
                System.out.println("Double: 0.0");
                if(yazi5 == "mms"){
                    System.out.println("Int: 0");
                }
            }
        }



    }


    }
