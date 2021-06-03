
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double var1,double var2)
    {
        int myFirstCheck = (int)(var1 * 1000);
        int mySecondCheck =(int)(var2 * 1000);

        if (myFirstCheck - mySecondCheck == 0){
            return true;
        }
        else
        {
            return false;
        }
    }
}
