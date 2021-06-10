public class SharedDigit {
    public static boolean hasSharedDigit(int var1, int var2)
    {
        if ((var1<10 || var1>99) || (var2<10 || var2>99))
        {
            return false;
        }

        int last_digit1 = var1 % 10;
        int last_digit2 = var2 % 10;

        var1 /= 10;
        var2 /= 10;

        int first_digit1 = var1;
        int first_digit2 = var2;

        if ((last_digit1==last_digit2)|| (last_digit1==first_digit2)||(last_digit2==first_digit1)||(first_digit2==first_digit1))
        {
            return true;
        }

        else
            return false;
    }
}
