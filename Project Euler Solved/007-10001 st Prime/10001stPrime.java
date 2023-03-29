public class 10001stPrime {
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
