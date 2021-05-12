
/**
 * Write a description of class MusicLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicLibrary
{
    private Album[] library;
    private double totalPlayTime;
    private int totalTracks;
    private int openIndex;
    private boolean sorted = false;
    
    public MusicLibrary(){
        library = new Album[10];
        totalPlayTime = 0;
        totalTracks = 0;
        openIndex = 0;
    }
    
    public void doubleSize()
    {
        Album[] newLibrary = new Album[library.length * 2];
        for (int i = 0; i < library.length; i++)
        {
            newLibrary[i] = library[i];
        }
        library = newLibrary;
    }
    public void remove(int index){
        totalTracks -= library[index].getNumSongs();
        totalPlayTime -= library[index].getLength();
        library[index] = null;
    }
    public void add(Album album){
        if(openIndex == -1){
            System.out.println("Your music library is full!");
        }
        else{
            library[openIndex] = album;
            totalTracks += album.getNumSongs();
            totalPlayTime += album.getLength();
            
            int n;
            for (n=0; n < library.length; n++){
                if(library[n] == null){
                    openIndex = n;
                    break;
                }
            }
                if(n == library.length){
                    openIndex = -1;
                }
            }
    }
    public String toString(){
        String result = "Number of tracks: " + totalTracks + "\nLength of Album: " + totalPlayTime + " minutes" + "\nSize of Library: " + library.length + " Albums: \n\n";
        for (int i =0; i < library.length; i++){
            if(library[i] != null)  result += library[i] + "\n\n";
        }
        return result;
    }
    public String linearArtSearch(String target){
        for(int i =0; i < library.length; i++){
            if(library[i] == null) break;
            String holder = library[i].getArtist();
            if(holder.equals(target)) return "Album found!\n"; 
        }
        return "Album not found";
    }
    public String linearTitleSearch(String target){
       for(int i =0; i < library.length; i++){
           if(library[i] == null) break;
           String holder = library[i].getName();
           if(holder.equals(target)) return "Album found!\n";  
        }
       return "Album not found";
    }
    //Selection sort doesn't work, I'm confused about it so I moved on
    //I would've committed an at of violence if I kept trying to make it work
    public void selSort(){
        String lowest;
        for(int i =0; i < library.length -1; i++){
            char frst = library[i].getName().charAt(0);
            lowest = library[i].getName();
            int scan;
            for(scan = i+1; scan < library.length; scan++){
                if(library[scan] == null) break;
                char scnd = library[scan].getName().charAt(0);
                int compare1 = frst;
                int compare2 = scnd;
                if(compare2 < compare1) lowest = library[scan].getName();
            }
            if(library[scan] == null) break;
            Album temp = library[i];
            library[i] = library[scan];
            library[scan] = temp;
        }        
    }
    //Fully Works - Sorts by artist
    public void insertionSort(){
        for(int i =0; i < library.length; i++){
            Album key = library[i];
            int position = i;
            if (library[position] == null){ /* System.out.println("Null"); */ break;}
            while(position > 0 && library[position - 1].getArtist().charAt(0) > key.getArtist().charAt(0)){
                library[position] = library[position-1];
                position--;
            }
            library[position] = key;
        }
        sorted = true;
    }
    //Fully works, modified to currently search by Artist
    public int binarySearch(String target){
        if(!sorted){System.out.println("Search aborted, library not sorted"); return -1;}
        int index = Integer.MAX_VALUE;
        
        int i = library.length-1;
        while(library[i] == null)
        {
            i--;
        }
        int high = i;
        
        //System.out.println(high);
        int low = 0;
        while(low <= high){
            int mid = (low + high)/2;
            //if(library[mid] == null) System.out.println("Null found");
            if(library[mid].getArtist().compareTo(target) < 0){
                low = mid+1;
            }
            else if(library[mid].getArtist().compareTo(target) > 0){
                high = mid-1;
            }
            else if(library[mid].getArtist().equals(target)){
                index = mid;
                break;
            }
        }
        return index;
    }
        
                
        
}
