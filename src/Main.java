import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // random object
        Random random = new Random();

        // user input obj
        Scanner input = new Scanner(System.in);

        int randomNum = random.nextInt(100);

        boolean playing = false;

        while (!playing) {
            System.out.print("Choose a number between 0 and 99 (type 500 to exit the game): ");


            int selectedNum = input.nextInt();

            if (selectedNum == 500) {
                playing = true;
            } else if (selectedNum > randomNum) {
                System.out.println("The number is too High");
            } else if (selectedNum < randomNum) {
                System.out.println("The number is too low");
            } else if (selectedNum == randomNum) {
                System.out.println("Yay! You got it");
                playing = true;
            }

        }
        input.close();


    }

}