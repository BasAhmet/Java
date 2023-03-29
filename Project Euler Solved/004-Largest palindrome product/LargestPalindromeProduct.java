public class LargestPalindromeProduct {
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
