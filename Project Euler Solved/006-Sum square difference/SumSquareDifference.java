package practices.projecteulernetproblem;
public class P006_SumSquareDifference {
    /*
    Sum square difference
    Problem 6
    The sum of the squares of the first ten natural numbers is,
    1²+2²+...10²=385
    The square of the sum of the first ten natural numbers is,
    (1+2+...+10)²=55²=3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is.
    3025-385=2640
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    /*
    Toplam kare farkı
    Soru : 6
    İlk on doğal sayının karelerinin toplamı,
    1²+2²+...10²=385
    İlk on doğal sayının toplamının karesi,
    (1+2+...+10)²=55²=3025
    Dolayısıyla, ilk on doğal sayının kareleri toplamı ile toplamın karesi arasındaki fark.
    3025-385=2640
    İlk yüz doğal sayının kareleri toplamı ile toplamın karesi arasındaki farkı bulun.
     */
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
