import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        int age;
        System.out.println("What is your name?");
        Scanner scn = new Scanner(System.in);
        name = scn.nextLine();
        System.out.println("How old are you?");
        age = scn.nextInt();
        if (age < 18) {
            System.out.println("You are teenager");
        } else {
            System.out.println("you are an adult already");
        }

    }
}
