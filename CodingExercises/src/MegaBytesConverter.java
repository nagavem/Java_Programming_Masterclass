public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        int megabytes,rem_kilo;
        if (kiloBytes<0)
        {
            System.out.println("Invalid Value");
        }
        else {
            megabytes = kiloBytes / 1024;
            rem_kilo = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = "+megabytes+ " MB and "+rem_kilo+" KB ");
        }
    }
}
