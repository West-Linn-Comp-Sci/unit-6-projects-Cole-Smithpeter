
/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album
{
    private String name;
    private String artist;
    private int numSongs;
    private double length;
    
    public Album(String name, String artist, int numSongs, double length){
        this.name = name;
        this.artist = artist;
        this.numSongs = numSongs;
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public int getNumSongs(){
        return numSongs;
    }
    public String getName(){
        return name;
    }
    public String getArtist(){
        return artist;
    }
    public String toString(){
        String result = "Title: " + name + "\nArtist: " + artist + "\nNumber of Songs: " + numSongs + "\nLength of the album: " + length + " minutes";
        return result;
    }
    public void setName(String input){
        this.name = input;
    }
}
