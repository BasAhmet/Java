public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        largestPrimeFactor(number);
    //71, 839, 1471, 6857
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
        long section;
        for (long i = 2; i < number ; i++) {
            if (number % i == 0) {
                section = number/i;
                long result = isItPrime(section);
                if (result != 0) {
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}

