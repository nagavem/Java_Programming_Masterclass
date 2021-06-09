public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
       int firstDigit = number;
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number>= 10)
        {
            number/= 10;
            firstDigit = number;
        }

        return firstDigit + lastDigit;
    }
}
