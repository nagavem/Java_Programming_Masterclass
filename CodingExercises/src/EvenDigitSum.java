public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        if (number < 0)
        {
            return -1;
        }

        int sum = 0;
        while (number> 0)
        {
            int last_digit = number % 10;
            if (last_digit % 2 ==0)
            {
                sum += last_digit;
            }

            number =number/10;
        }
        return sum;
    }
}
