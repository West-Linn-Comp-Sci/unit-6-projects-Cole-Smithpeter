public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "One Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("Bass Boys - The bassening" , "Bass Boys" ,10,45);
        Album a5 = new Album("Huge", "ACDC", 25, 79.2);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a4);
        myLibrary.add(a5);
        
        System.out.println(myLibrary.linearArtSearch("Bass Boys"));
        
        

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();
        
        myLibrary.insertionSort();

        System.out.println("Sorted by ARTIST\n" + myLibrary);
        
        System.out.println("Searching for Bass Boys as artist");
        System.out.println("Album at index: " + myLibrary.binarySearch("Bass Boys"));
        
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}