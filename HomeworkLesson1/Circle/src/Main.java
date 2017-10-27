import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double radius, pi = 3.1415925, perimeter, area;
        System.out.println("Enter the radius of the circle:");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        // Calculate perimeter
        perimeter = 2 * pi * radius;
        System.out.println("Perimeter of the circle = " + perimeter);
        // Calculate area
        area = pi * radius *radius;
        System.out.println("Are of the circle = " + area);
    }
}
