import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        try{
            menu();
        }catch (Exception e){
            System.out.println("Hatalı bir giriş yaptınız tekrar deneyiniz.");
            menu();
        }

    }
    public static  Scanner input = new Scanner(System.in);
    public static boolean play = true;
    public static void menu(){
        System.out.println("\n*************** Sayı Tahmin Oyununa Hoşgeldiniz ***************");
        System.out.print("Benim tuttuğum sayıyı tahmin etmek için 1 giriniz.\n" +
                "Sizin tuttuğunuz sayıyı tahmin etmem için 2 giriniz.\n" +
                "Çıkmak için 0 giriniz\n" +
                "***************************************************************\n" +
                "GİRİŞ : ");
        int oyunSecimi = input.nextInt();

        if(oyunSecimi==1) {
            insanTahmini();
        }
        if(oyunSecimi==2) {
            bilgisayarTahmini();
        }
        if(oyunSecimi==0){
            System.out.println("Çıkış Yapılıyor...");

            play = false;
        }
    }
    public static boolean yeniOyun(){
        System.out.println("Yeni oyun oynamak istermisiniz(e / h) giriniz.");
        String yenioyun = input.next();
        if(yenioyun.equals("e")){
            menu();
        }
        if (yenioyun.equals("h")){
            System.out.println("Çıkış yapılıyor.");
            play = false;
        }
        return play;
    }
    public static void bilgisayarTahmini(){
        System.out.println("Tahmin etmem için 0 ile 100 arasında bir sayı tut.");
        int a = 0;
        int b = 100;
        int tahminSayisi = 1;
        while(play){
            if (tahminSayisi > 6){
                System.out.println("Bana verilen tahmin sayısında bilemedim :(");
                yeniOyun();  //Burayı method yap///////////////
            }
            int tahmin = (a+b)/2;
            System.out.println("Tuttuğun sayı " + tahmin + " mi?");
            System.out.print("Doğru ise (=)\nFazla söylediysem (+)\nEksik söylediysem (-)\nGiriniz : ");
            String cevap = input.next();
            if(cevap.equals("=")){
                System.out.println(tahminSayisi + " tahminde kazandım tebrikler bana. Bana bir ram alırsın artık :)");
                yeniOyun();
            } else if (cevap.equals("+")) {
                b=tahmin;
            } else if (cevap.equals("-")) {
                a=tahmin;
            }
            tahminSayisi++;
        }
    }
    public static void insanTahmini(){
        int count = 1;
        int tahminEdilecekSayi = (int) (Math.random()*100);
        System.out.println(tahminEdilecekSayi);
        System.out.println("0 ile 100 arasında bir sayı tuttum tahmin et.");
        int tahminSayisi;
        while (play){
            System.out.print(count + ". TAHMİN : ");
            tahminSayisi = input.nextInt();
            if (tahminSayisi>tahminEdilecekSayi){
                System.out.println("Fazla söyledin. Yeni bir tahmin gir.");
            }else if (tahminSayisi<tahminEdilecekSayi){
                System.out.println("Az söyledin. Yeni bir tahmin gir.");
            }else{
                System.out.println("Tebrikler tahminin başarılı.");
                yeniOyun();
            }
            count++;
        }
    }
}
