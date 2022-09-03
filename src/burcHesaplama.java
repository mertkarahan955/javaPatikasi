import java.util.Scanner;

public class burcHesaplama {
    public static void main(String[] args) {

        int ocak, subat, mart, nisan, mayis, haziran, temmuz, agustos, eylul, ekim, kasim, aralik, dogumAyi;
        int gun;

        ocak = 1;
        subat = 2;
        mart = 3;
        nisan = 4;
        mayis = 5;
        haziran = 6;
        temmuz = 7;
        agustos = 8;
        eylul = 9;
        ekim = 10;
        kasim = 11;
        aralik = 12;


        Scanner inp = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz : ");
        dogumAyi = inp.nextInt();
        System.out.println("doğduğunuz günü giriniz : ");
        gun = inp.nextInt();

        if (dogumAyi == ocak) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz oğlak");
            } else {
                System.out.println("Burcunuz kova ");
            }
        } else if (dogumAyi == subat) {
            if (gun <= 19) {
                System.out.println("burcunuz kova");
            } else {
                System.out.println("burcunuz balık");
            }
        } else if (dogumAyi == mart) {
            if (gun <= 20) {
                System.out.println("burcunuz balık");
            }else{
                System.out.println("Burcunuz koç ");
            }
        }else if(dogumAyi == nisan){
            if(gun<= 20){
                System.out.println("burcunuz koç");
            }else{
                System.out.println("burcunuz boğa ");
            }
        }else if(dogumAyi == mayis){
            if(gun<=21){
                System.out.println("burcunuz boğa");
            }else{
                System.out.println("burcunuz ikizler");
            }
        }else if(dogumAyi == haziran){
            if(gun<= 22){
                System.out.println("burcunuz ikizler ");
            }else{
                System.out.println("burnucuz yengeç");
            }
        }else if(dogumAyi == temmuz){
            if(gun<=22){
                System.out.println("burcunuz yengeç ");
            }else{
                System.out.println("burcunuz aslan");
            }
        } else if(dogumAyi == agustos){
            if(gun<=22){
                System.out.println("burcunuz aslan");
            }else {
                System.out.println("burcunuz başak ");
            }
        }else if(dogumAyi == eylul){
            if(gun<=22){
                System.out.println("burcunuz başak");
            }else{
                System.out.println("burcunuz terazi");
            }
        }else if(dogumAyi == ekim){
            if(gun<=22){
                System.out.println("Burcunuz terazi");
            }else{
                System.out.println("burcunuz akrep");
            }
        }else if(dogumAyi == kasim){
            if(gun<=21){
                System.out.println("burcunuz akrep ");
            }else{
                System.out.println("burcunuz yay");
            }
        }else if(dogumAyi == aralik){
            if(gun<=22){
                System.out.println("burcunuz yay");
            }else{
                System.out.println("burcunuz oğlak ");
            }
        }
    }
}