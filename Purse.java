
/**
 * Write a description of class Purse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Purse
{
    private ArrayList coins; 
 
    public Purse() { 
        coins = new ArrayList(); 
    }
 
    // adds aCoin to the purse 
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
 
    // returns total value of all coins in purse 
    public double getTotal() { 
        double sum = 0;
        for(int i = 0; i < coins.size(); i++){
            sum += coins.get(i).getValue();
        }
        return sum;
    } 
 
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        int count = 0;
        for(int i = 0; i < coins.size(); i++){
            if(coins.get(i).equals(aCoin)) count++;
        }
        return count;
    } 
}

