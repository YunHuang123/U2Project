import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your first coordinate: ");
        String pointOne = s.nextLine();
        System.out.print("Please enter your second coordinate: ");
        String pointTwo = s.nextLine();
        System.out.println("First Coordinate: " + pointOne);
        System.out.print("Second Coordinate: " + pointTwo);

        String xOne = pointOne.substring(1, pointOne.indexOf(","));
        String yOne = pointOne.substring(pointOne.indexOf(",") + 1, pointOne.indexOf(")"));
        String xTwo = pointTwo.substring(1, pointTwo.indexOf(","));
        String yTwo = pointTwo.substring(pointTwo.indexOf(",") + 1, pointTwo.indexOf(")"));
        int x1 = Integer.valueOf(xOne);
        int y1 = Integer.valueOf(yOne);
        int x2 = Integer.valueOf(xTwo);
        int y2 = Integer.valueOf(yTwo);

        LinearEquation one = new LinearEquation(x1, y1, x2, y2);
        System.out.println(one.toString());

        System.out.print("Enter an x-value: ");
        String xThree = s.nextLine();
        double x3 = Double.valueOf(xThree);
        double y3 = (((double)y2 - y1)/((double)x2 - x1)) * (x3) + (((((double)y2 - y1)/((double)x2 - x1)) * x1 * -1) + y1);
        System.out.print("(" + x3 + ", " + String.format("%.2f", y3) + ")");
    }
}
