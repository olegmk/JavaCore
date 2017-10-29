public class Main {

    public static void main(String[] args) {
	// write your code here
        //char a = '*', b = ' ';
        //int c = 5, i, j;
        System.out.println();
        for (int i = 0; i < 9; i++){
            if (i % 4 == 0 && i > 0 && i < 8){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0 && i > 1 && i < 7) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();
        for (int i = 0; i < 9; i++){
            if (i % 2 == 0){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
