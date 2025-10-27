import java.util.Random;
import java.util.Scanner;

public class LoopDesign {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    
    public static void main(String[] args) {
        int rollAmount;
        int timesRolled = 0;
        int result = 0;
        
        System.out.println("Enter how many times to roll the dice:");
        rollAmount = input.nextInt();

        while (timesRolled < rollAmount) {
            timesRolled++;
            result = random.nextInt(6);
        }
        
        System.out.println("The die has been rolled " + rollAmount + " times, and the side landed on is " + result +"!");
    }
}
