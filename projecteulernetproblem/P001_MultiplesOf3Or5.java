package practices.projecteulernetproblem;

public class P001_MultiplesOf3Or5 {
    public static void main(String[] args) {
        multiples(1000);
    }

    /*
    Multiples of 3 or 5
    Problem 1
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
    */
    /*
    3 veya 5'in katları
    Soru : 1
    10'un altındaki 3 veya 5'in katı olan tüm doğal sayıları sıralarsak 3, 5, 6 ve 9 elde ederiz.
    Bu katların toplamı 23'tür.
    1000'in altındaki 3 veya 5'in tüm katlarının toplamını bulun.
    */
    public static void multiples(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i%3==0 || i%5==0) {
                sum = sum + i;
            }
        }
        System.out.println(number + " sayısından küçük 3 veya 5 ile\n" +
                "bölünebilen sayıların toplamı : " + sum);
    }






}
