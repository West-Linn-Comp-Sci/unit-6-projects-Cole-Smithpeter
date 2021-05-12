
/**
 * Write a description of class BattleShipRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 
public class BattleShipRunner
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Battleship game = new Battleship();
        game.locations();
        System.out.println("Welcome to battleship, the game has begun\n");
        while(!game.testKill()){
            System.out.println("Guess where the ship is, range is 1-7");
            int guess = 0;
            guess = Integer.parseInt(in.nextLine());
            while(guess > 7 || guess < 1){
                System.out.println("Invalid guess, try again");
                guess = Integer.parseInt(in.nextLine());
            }
            game.testHit(guess-1);
            if(game.testKill()){
                System.out.println("You sunk the battleship!");
            }
        }
        System.out.println("\nGame Over\n");
        
    }
}
