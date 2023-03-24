public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        multiples(1000);
    }
    public static void multiples(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i%3==0 || i%5==0) {
                sum = sum + i;
            }
        }
        System.out.println(number + " sayısından küçük 3 veya 5 ile\nbölünebilen sayıların toplamı : " + sum);
    }
}
