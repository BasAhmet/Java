package practices.projecteulernetproblem;

public class P005_SmallestMultiple {
    /*
    Smallest multiple
    Problem 5
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    */
    /*
    En küçük çoklu
    Soru : 5
    2520, 1'den 10'a kadar olan sayıların her birine kalansız bölünebilen en küçük sayıdır.
    1'den 20'ye kadar tüm sayılara bölünebilen en küçük pozitif sayı nedir?
    */
    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i < 21 ; i++) {
            result = ekok(result,i);
        }
        System.out.println("1'den 20'ye kadar tüm sayılara bölünebilen en küçük sayı : \n" + result);
    }
    public static int ekok(int number1, int number2){
        int carpan1 = 2;
        int carpan2 = 2;
        while(number1 != number2){
            if(number1<number2){
                number1 /= carpan1-1;
                number1 *= carpan1;
                carpan1++;
            }else if(number1>number2){
                number2 /= carpan2-1;
                number2 *= carpan2;
                carpan2++;
            }
        }
        return number1;
    }
}
