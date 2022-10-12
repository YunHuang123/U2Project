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
    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //method
    public String pointOne(int x1, int y1)
    {
        return "(" + x1 + "," +  y1 + ")";
    }
    public String pointTwo(int x2, int y2)
    {
        return "(" + x2 + "," +  y2 + ")";
    }

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
        return "y = " + slope + "x " + "+ " + yInt;
    }

    public String toString()
    {
        info = "Slope of Line: " + calculateSlope() + "\nY-intercept: " + yInt();
        return info;
    }





}
