import java.util.Random;
import java.util.Scanner;

public class NumberGame implements RepeatedGame{

    private int guessingNumber;
    private int currentGuestNumber;
    private int rangeOfNumber = 100;
    private Scanner input = new Scanner(System.in);

    public void setRangeOfNumber(int range){
        this.rangeOfNumber = range;
    }

    public Boolean Condition(){
        return guessingNumber != currentGuestNumber;
    }

    public void Inirializer(){
        this.guessingNumber = new Random().nextInt(rangeOfNumber);
        System.out.println("Try to guess a number in range " + rangeOfNumber);
    }

    public void GamingProcess() {
        System.out.print("Type a number ... ");
        currentGuestNumber = input.nextInt();
    }

    public void Finish() {
        System.out.println("You won!");
    }
}
