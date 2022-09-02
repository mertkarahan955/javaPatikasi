// derslerin notlarını toplayıp ortalamasının en düşük geçme notundan büyük olup olmadığına bakalım



import java.util.Scanner;

public class sinifAtlama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mat,kimya,fizik,biyoloji,gecmeNotu;
       gecmeNotu = 65;


        double ortalama,nOrtalama;

        System.out.print("mat notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("biyoloji notunuzu giriniz : ");
        biyoloji = inp.nextInt();

        if(mat<0 || mat>100){
            ortalama = (fizik + kimya + biyoloji)/3;
            if(ortalama>gecmeNotu){
                System.out.println("tebrikler sınıfı " + ortalama + " ile geçtiniz ");

            }
            else{
                System.out.println("kaldınız !!!");
            }}

        if(kimya<0 || kimya>100){
            ortalama = (mat + fizik + biyoloji)/3;
            if(ortalama>gecmeNotu){
                System.out.println("tebrikler sınıfı " + ortalama + " ile geçtiniz ");

            }
            else{
                System.out.println("kaldınız !!!");
            }}
        if(fizik<0 || fizik>100){
            ortalama = (mat + fizik + biyoloji)/3;
            if(ortalama>gecmeNotu){
                System.out.println("tebrikler sınıfı " + ortalama + " ile geçtiniz ");

            }
            else{
                System.out.println("kaldınız !!!");
            }
        }
        if(biyoloji<0 || biyoloji>100) {
            ortalama = (mat + kimya + fizik) / 3;
            if(ortalama>gecmeNotu){
                System.out.println("tebrikler sınıfı " + ortalama + " ile geçtiniz ");

              }
            else{
                System.out.println("kaldınız !!!");
            }
        }

        else{
            nOrtalama = (mat + fizik + kimya + biyoloji)/4;
            System.out.println("EĞER NOTLARINIZ 0-100 ARALIĞINDA DEĞİLSE ÜSTTEKİ SONUCU BAZ ALINIZ !!");
            System.out.println("TEBRİKLER " + nOrtalama + " NOTU İLE GEÇTİNİZ ");
        }



        }



    }


