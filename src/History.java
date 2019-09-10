import java.util.Scanner;

public class History {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] presidents = new String[10];
        System.out.println("Enter the names of USA presidents starting with the LEAST recent.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name #" + (i+1) + ": ");
            presidents[i] = sc.nextLine();
        }
        System.out.println("Displaying using for loop and int i: ");
        for (int i = 9; i >= 0; i--) {

            System.out.println(presidents[i]);
        }
//        System.out.println("Displaying using for loop and president:presidents: ");
//        for (String president:presidents) {
//            System.out.println(president);
//        }
    }
}
