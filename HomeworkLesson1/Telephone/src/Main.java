import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String country1, country2, country3;
        int time1, time2, time3;
        double sum1, sum2, sum3, sum, tarrif1, tarrif2, tarrif3;

        Scanner sc = new Scanner(System.in);

        //Time
        System.out.println("Enter the time of the call for the first country in minutes: ");
        time1 = sc.nextInt();
        System.out.println("Enter the time of the call for the second country in minutes: ");
        time2 = sc.nextInt();
        System.out.println("Enter the time of the call for the third country in minutes: ");
        time3 = sc.nextInt();

        //Tarrif
        System.out.println("Enter the cost of the call for the first country: ");
        tarrif1 = sc.nextDouble();
        System.out.println("Enter the cost of the call for the second country: ");
        tarrif2 = sc.nextDouble();
        System.out.println("Enter the cost of the call for the second country: ");
        tarrif3 = sc.nextDouble();

        //Sum
        sum1 = tarrif1 * time1;
        sum2 = tarrif2 * time2;
        sum3 = tarrif3 * time3;
        sum = sum1 + sum2 +sum3;

        //Out results
        System.out.println("The cost of first call: " + sum1);
        System.out.println("The cost of second call: " + sum2);
        System.out.println("The cost of third call: " + sum3);
        System.out.println("The cost of all calls: " + sum);
    }
}
