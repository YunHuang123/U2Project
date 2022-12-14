public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int rise;
    private int run;
    private double slope;
    private double yInt;
    private double inverse;
    private double distance;
    private String info;

    //constructor
    public LinearEquation(int xOne, int yOne, int xTwo, int yTwo)
    {
        x1 = xOne;
        y1 = yOne;
        x2 = xTwo;
        y2 = yTwo;
    }

    //method
    public double calculateSlope()
    {
        rise = y2 - y1;
        run = x2 - x1;
        slope = (double)rise / run;
        return slope;
    }

    public double yInt()
    {
        inverse = slope * x1 * -1;
        yInt = inverse + y1;
        return yInt;
    }

    public String slopeIntForm()
    {
        return "y = " + rise + "/" + run + "x " + "+ " + String.format("%.2f", yInt);
    }

    public double getDistance()
    {
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    public String toString()
    {
        info = "\nSlope of Line: " + String.format("%.2f", calculateSlope()) + "\nY-intercept: " + String.format("%.2f", yInt()) + "\nSlope Intercept Form: " + slopeIntForm() + "\nDistance Between Coordinates: " + String.format("%.2f", getDistance());
        return info;
    }





}
