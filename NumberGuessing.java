import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void guessthenumber() {
        Scanner sc = new Scanner(System.in);
        int max = 100;
        Random ran = new Random();
        System.out.println("Random number generated by computer");
        int n = ran.nextInt(max);
        int k = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println("Guess the number");
            int a = sc.nextInt();
            if (a == n) {
                System.out.println("continue the game with number " + a);
            } else if (a > n) {
                System.out.println("Guessing number is greater than the random number");
            } else {
                System.out.println("Guessing number is less than the random number");
            }
        }

    }

    public static void main(String[] args) {

        guessthenumber();
    }
}
