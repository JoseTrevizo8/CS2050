/*
Jose Trevizo
Part of Program 1
CS2050
*/
public class Album {
    private String Title = "Renaissance"; // String for album title
    private String performer= "Beyonce";// String for performer
    private String genre = "easy listening"; // String for genre
    private int numOfSongs = 10; // int for number of songs
    public String getTitle(){ // getter for Title
        return Title;
    }
    public String getPerformer(){ // getter for Performer
        return performer;
    }
    public String getGenre(){ // getter for Genre
        return genre;
    }

    public int getNumOfSongs() { // getter for Songs
        return numOfSongs;
    }

    public Album(){ //default constructor

    }
    public Album(String title, String performer, String genre, int numOfSongs){ // constructor with 4 parameters & with setters
        this.Title = title;
        this.performer = performer;
        this.genre = genre;
        this.numOfSongs = numOfSongs;

    }
    public String toString(){
        return "Album Title: " + Title + "\n" +
                "Performer: " + performer + "\n" +
                "Genre: " + genre + "\n" +
                "Number of Songs in Album: " + numOfSongs;
    }
    boolean isLong(){
        return numOfSongs > 50;
    }
}
