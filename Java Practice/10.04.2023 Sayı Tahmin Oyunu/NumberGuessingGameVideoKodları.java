import java.util.Scanner;
public class NumberGuessingGame2 {
    public static void main(String[] args) {
        try{
            menu();
        }catch (Exception e){
            System.out.println("Hatalı giriş yapıldı. Tekrar deneyin.");
            menu();
        }
    }
    public static Scanner input = new Scanner(System.in);
    public static void menu(){

        System.out.println("\n*************** Sayı Tahmin Oyununa Hoşgeldiniz ***************");
        System.out.print("Benim tuttuğum sayıyı tahmin etmek için 1 giriniz.\n" +
                "Sizin tuttuğunuz sayıyı tahmin etmem için 2 giriniz.\n" +
                "Çıkmak için 0 giriniz\n" +
                "***************************************************************\n" +
                "GİRİŞ : ");
        int secenek = input.nextInt();
        if(secenek==1){
            oyuncuTahmini();
        }else if(secenek==2){
            bilgisayarTahmini();
        }else{
            System.out.println("Oyundan Çıkılıyor.");
        }
    }
    public static boolean newGame = true;
    public static void bilgisayarTahmini(){
        System.out.println("Tahmin etmem için 0 ile 100 arasında bir sayı tutunuz.");
        int a = 0;
        int b = 100;
        int tahminSayisi = 1;
        while(tahminSayisi<6){
            int tahmin = (a+b)/2;
            System.out.println("Tahminim yüksekse (+)\n" +
                    "Tahminim düşükse (-)\n" +
                    "Tahminim doğruysa (=)\n" +
                    "Giriniz.");
            System.out.println("Tahminim : " + tahmin);
            String cevap = input.next();
            if(cevap.equals("+")){
                b = tahmin;
            }else if(cevap.equals("-")){
                a = tahmin;
            }else if(cevap.equals("=")){
                System.out.println("Doğru tahmin ettim tebrikler bana.");
                System.out.println("Yeni oyun oynamak istermisin ? (e/h)");
                String yeniOyun = input.next();
                if(yeniOyun.equals("e")){
                    menu();
                }else{
                    break;
                }
            }
            tahminSayisi++;
        }
    }
    public static void oyuncuTahmini(){
        int tahminEdilecekSayi = (int)(Math.random()*100);
        System.out.println(tahminEdilecekSayi);
        System.out.println("0 ile 100 arasında sayı tuttum tahmin et.");
        while(newGame){
            int oyuncuTahmini = input.nextInt();
            if (tahminEdilecekSayi<oyuncuTahmini){
                System.out.println("Fazla söyledin yeni bir tahminde bulun.");
            }else if (tahminEdilecekSayi>oyuncuTahmini){
                System.out.println("Az söyledin yeni bir tahminde bulun.");
            }else {
                System.out.println("Tebrikler tuttuğum sayıyı buldun.");
                System.out.println("Yeni oyun oynamak istermisin ? (e/h)");
                String yeniOyun = input.next();
                if(yeniOyun.equals("e")){
                    menu();
                }else {
                    newGame = false;
                }
            }
        }
    }
}
