public class SumSquareDifference {
    public static void main(String[] args) {
        int karelerToplami = 0;
        int toplamlarKaresi = 0;
        for (int i = 1; i < 101; i++) {
            karelerToplami += i*i;
            toplamlarKaresi += i;
        }
        toplamlarKaresi = toplamlarKaresi*toplamlarKaresi;
        System.out.println("Toplamların karesi : " + toplamlarKaresi);
        System.out.println("Karelerin toplamı  : " + karelerToplami);
        System.out.println(toplamlarKaresi + " - " + karelerToplami + " = " + (toplamlarKaresi - karelerToplami));
    }
}
