public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (num != 0) {

            int last_dig = num % 10;
            reverse = reverse * 10;
            reverse += last_dig;
            num = num / 10;
        }
        return (reverse == number);
    }
}