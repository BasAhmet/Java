public class SmallestMultiple {
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
