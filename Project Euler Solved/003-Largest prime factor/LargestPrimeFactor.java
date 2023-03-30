//71, 839, 1471, 6857
public class LargestPrimeFactor {
    public static boolean isItPrime(long number) {
        int numberSqrt = (int) Math.sqrt(number);
        boolean isItPrime = true;
        for (int i = 2; i < numberSqrt + 1; i++) {
            if (number % i == 0) {
                isItPrime = false;
                break;
            }
        }
        return isItPrime;
    }
    public static void largestPrimeFactor(long number){
        long section;
        for (long i = 2; i < number ; i++) {
            if (number % i == 0) {
                section = number/i;
                if (isItPrime(section)) {
                    System.out.println(section);
                    break;
                }
            }
        }
    }
}

