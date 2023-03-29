package practices.projecteulernetproblem;

public class P007_10001stPrime {
    /*
    10001st prime
    Problem 7
    By listing the first six prime numbers:
    2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10 001st prime number?
     */
    /*
    10001. asal sayı
    Soru : 7
    İlk altı asal sayıyı listeleyerek:
    2, 3, 5, 7, 11 ve 13, 6. asalın 13 olduğunu görebiliriz.
    10 001'inci asal sayı nedir?
     */
    //104743
    public static void main(String[] args) {
        int primeNumber = 0;
        int number = 2;
        int counter = 0;
        while(counter<10001){
            if(isItPrime(number) != 0){
                primeNumber = number;
                counter++;
                System.out.println((counter) + ". asal sayı : " + primeNumber);
            }
            number++;
        }
    }
    public static long isItPrime(long number) {
        int numberSqrt = (int) Math.sqrt(number);
        long result = 0;
        boolean isItPrime = true;
        for (int i = 2; i < numberSqrt + 1; i++) {
            if (number % i == 0) {
                isItPrime = false;
                break;
            }
        }
        if (isItPrime) {
            result = number;
        }
        return result;
    }
}
