public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        fibonacciNumbers();
    }
    public static void fibonacciNumbers(){
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int sum = 2;
        System.out.println(numberOne);
        System.out.println(numberTwo);
        while (true){
            numberOne = numberTwo;
            numberTwo = numberThree;
            numberThree = numberOne + numberTwo;
            if (numberThree >= 4000000){
                break;
            }
            System.out.println(numberThree);
            if (numberThree%2==0){
                sum += numberThree;
            }
        }
        System.out.println("Toplam : " + sum);
    }
}
