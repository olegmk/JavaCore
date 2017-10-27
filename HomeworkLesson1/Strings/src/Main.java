import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name, address;
        System.out.println("What is your name?");
        Scanner scan1 = new Scanner(System.in);
        name = scan1.next();
        System.out.println("Where are you live, " + name + "?");
        Scanner scan2 = new Scanner(System.in);
        address = scan2.next();
        System.out.println(name + " " + address);
    }
}
