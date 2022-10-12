import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        System.out.print("Please enter your first coordinate: ");
        String pointOne = s.nextLine();
        System.out.print("Please enter your second coordinate: ");
        String pointTwo = s.nextLine();
        System.out.println("First Pair: " + pointOne);
        System.out.println("Second Pair: " + pointTwo); */

        LinearEquation one = new LinearEquation(1, 3,1,5);
        System.out.println(one.toString());
    }
}
