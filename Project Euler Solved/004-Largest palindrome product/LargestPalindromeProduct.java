package practices.projecteulernetproblem;

public class P004_LargestPalindromeProduct {
    /*
    Largest palindrome product
    Problem 4
    A palindromic number reads the same both ways.
    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.
    */
    /*
    En büyük palindrom ürünü
    Soru : 4
    Palindromik bir sayı her iki şekilde de aynı şeyi okur.
    2 basamaklı iki sayının çarpımından elde edilen en büyük palindrom 9009=91×99'dur.
    3 basamaklı iki sayının çarpımından oluşan en büyük palindromu bulun.
    */
    public static void main(String[] args) {
        int palindrom=0;
        int num1=0;
        int num2=0;
        for(int i=999;i>100;i--){
            for (int j = 999; j > 100; j--) {
                int number = i*j;
                if(palindrom(number) && number>palindrom){
                    palindrom = number;
                    num1 = i;
                    num2 = j;
                    break;
                }
            }
        }
        System.out.println(palindrom + " = " + num1 + " x " + num2 + "\nPalindromdur.");
    }
    public static boolean palindrom(int number){
        String palindromNumber = Integer.toString(number);
        String tersPalindrom = "";
        boolean palindromMu = false;
        for(int i=0; i<palindromNumber.length();i++)
            tersPalindrom = palindromNumber.substring(i,i+1) +tersPalindrom;
        if (palindromNumber.equals(tersPalindrom)){
            palindromMu = true;
        }
        return palindromMu;
    }
}
