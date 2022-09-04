import java.util.Scanner;

public class chinaZodiac {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

         int birthYear,kalan;

        System.out.print("Dogum yilinizi giriniz : ");
        birthYear = inp.nextInt();

         kalan = birthYear % 12;

          switch (kalan){
              case 0:
                  System.out.println("çin zodiacınız : Maymun");
                  break;
              case 1:
                  System.out.println("çin zodiac'ınız : Horoz ");
                  break;
              case 2:
                  System.out.println("çin zodiacınız : Köpek ");
                  break;
              case 3:
                  System.out.println("çin zodiacınız : Domuz ");
                  break;
              case 4:
                  System.out.println(" çin zodiacınız : Fare");
                  break;
              case 5:
                  System.out.println("çin zodiacınız : Öküz ");
                  break;
              case 6:
                  System.out.println("çin zodiacınız : Kaplan");
                  break;
              case 7:
                  System.out.println("çin zodiacınız : Tavşan");
                  break;
              case 8:
                  System.out.println("çin zodiacınız : Ejdarha ");
                  break;
              case 9:
                  System.out.println("çin zodiacınız : Yılan");
                  break;
              case 10:
                  System.out.println("çin zodiacınız : At");
                  break;
              case 11:
                  System.out.println("çin zodiacınız : Koyun ");
                  break;




          }
        }
    }


