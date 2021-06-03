public class AreaCalculator {

    public static  double area(double radius)
    {
        if (radius<0)
        {
            return -1.0;
        }

        double area_circ = radius * radius * Math.PI;
        return area_circ;

    }

    public static double area(double x, double y)
    {
        if (x<0 || y<0)
        {
            return -1.0;
        }

        double area_rect = x * y;
        return area_rect;

    }
}
