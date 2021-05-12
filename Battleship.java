
/**
 * Write a description of class BattleshipMechs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Battleship
{
    private ArrayList<Integer> map = new ArrayList<Integer>();
    
    public Battleship()
    {
        for (int i = 0; i < 7; i++){
        map.add(0);}
        int startVal = (int) Math.floor(Math.random()*5);
        for(int r = startVal; r < startVal + 3; r++){
            map.set(r,1);
        } 
    }
    public void locations(){
        for(int i = 0; i < map.size(); i++){
            System.out.printf(map.get(i) + " ");
        }
        System.out.println("\n\n");
    }
    public boolean testHit(int index)
     {
        if(map.get(index) == 1){
            map.set(index, 0);
            System.out.println("HIT!");
            return true;
        }
        System.out.println("You missed.");
        return false;
     }
    public boolean testKill(){
        for(int i = 0; i < map.size(); i++){
            if(map.get(i) == 1) return false;
        }
        return true;
    }
}
