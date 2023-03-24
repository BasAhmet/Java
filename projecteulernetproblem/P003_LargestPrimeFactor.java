package practices.projecteulernetproblem;

public class P003_LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475L;
        largestPrimeFactor(number);
    }
    /*
    Largest prime factor
    Problem 3
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
    */
    /*
    En büyük asal çarpan
    Soru : 3
    13195'in asal çarpanları 5, 7, 13 ve 29'dur.
    600851475143 sayısının en büyük asal çarpanı nedir?
    */
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
    public static void largestPrimeFactor(long number){
        for (long i = 2; i < number/2 ; i++) {
            if (number % i == 0) {
                long result = isItPrime(i);
                if (result != 0) {
                    System.out.println(result);
                }
            }
        }
    }

}

