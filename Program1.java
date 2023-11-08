import java.util.Scanner;
//Jose Trevizo
//CS2050
//Program 1
public class Program1 {
    public static void main(String[] args){
        String Title1, Title2, Title3;
        String performer;
        int genreChoice;
        String genre;
        int numOfSongs;
        System.out.println("Enter the Title of the Album 1");
        Scanner usrIn = new Scanner(System.in);
        Title1 = usrIn.nextLine(); // allows for input of title 1
        System.out.println("Enter the Performer of the Album 1");
        performer = usrIn.nextLine(); //allows input for performer
        System.out.println("Select the genre of the Album 1\n" +
                "Press 1 for: Hip-hop\n" +
                "Press 2 for: Easy listening\n" +
                "Press 3 for: Orchestral\n" +
                "Press 4 for: Your parents\n" +
                "Press 5 for: Theatre");
        genreChoice = usrIn.nextInt(); //selection for user choice 1
        if(genreChoice == 1){
            genre = "Hip-Hop";
        }else if(genreChoice == 2){
            genre = "Easy Listening";
        }else if(genreChoice ==3){
            genre = "Orchestral";
        }else if(genreChoice == 4){
            genre = "Your Parents";
        }else if(genreChoice == 5){
            genre = "Theatre";
        } else
            genre = "Easy Listening";

        System.out.println("Enter the number of songs in the Album 1");
        numOfSongs = usrIn.nextInt(); //sets up number of songs
        if (numOfSongs < 10) { // if number of songs is less than 10 it will set up the minimum value of 10
            numOfSongs = 10;
        }
        Album A1 = new Album(Title1,performer,genre,numOfSongs); //enters the information for album 1
        Scanner usrIn2 = new Scanner(System.in);
        System.out.println("Enter the Title of the Album 2");// album 2 start
        Title2 = usrIn2.nextLine(); // allows for input of title 2
        System.out.println("Enter the Performer of the Album 2");
        performer = usrIn2.nextLine(); //allows input for performer 2
        System.out.println("Select the genre of the Album 2\n" +
                "Press 1 for: Hip-hop\n" +
                "Press 2 for: Easy listening\n" +
                "Press 3 for: Orchestral\n" +
                "Press 4 for: Your parents\n" +
                "Press 5 for: Theatre");
        genreChoice = usrIn2.nextInt(); //selection for user choice 2
        if(genreChoice == 1){
            genre = "Hip-Hop";
        }else if(genreChoice == 2){
            genre = "Easy Listening";
        }else if(genreChoice ==3){
            genre = "Orchestral";
        }else if(genreChoice == 4){
            genre = "Your Parents";
        }else if(genreChoice == 5){
            genre = "Theatre";
        } else
            genre = "Easy Listening";

        System.out.println("Enter the number of songs in the Album 2");
        numOfSongs = usrIn2.nextInt(); //sets up number of songs for album 2
        if (numOfSongs < 10) { // if number of songs is less than 10 it will set up the minimum value of 10
            numOfSongs = 10;
        }
        Album A2 = new Album(Title2,performer,genre,numOfSongs); //enters the information for album 1
        Scanner usrIn3 = new Scanner(System.in);
        System.out.println("Enter the Title of the Album 3"); //album 3 start
        Title3 = usrIn3.nextLine(); // allows for input of title 3
        System.out.println("Enter the Performer of the Album 3");
        performer = usrIn3.nextLine(); //allows input for performer 3
        System.out.println("Select the genre of the Album 3\n" +
                "Press 1 for: Hip-hop\n" +
                "Press 2 for: Easy listening\n" +
                "Press 3 for: Orchestral\n" +
                "Press 4 for: Your parents\n" +
                "Press 5 for: Theatre");
        genreChoice = usrIn3.nextInt(); //selection for user choice 3
        if(genreChoice == 1){
            genre = "Hip-Hop";
        }else if(genreChoice == 2){
            genre = "Easy Listening";
        }else if(genreChoice ==3){
            genre = "Orchestral";
        }else if(genreChoice == 4){
            genre = "Your Parents";
        }else if(genreChoice == 5){
            genre = "Theatre";
        } else
            genre = "Easy Listening";

        System.out.println("Enter the number of songs in the Album 3");
        numOfSongs = usrIn3.nextInt(); //sets up number of songs for album 3
        if (numOfSongs < 10) { // if number of songs is less than 10 it will set up the minimum value of 10
            numOfSongs = 10;
        }
        Album A3 = new Album(Title3,performer,genre,numOfSongs); //enters the information for album 1
        System.out.println("Album 1 Information:");
        System.out.println(A1 + "\n_______________________");
        System.out.println("Album 2 Information:");
        System.out.println(A2 + "\n_______________________");
        System.out.println("Album 3 Information:");
        System.out.println(A3);
    }
}
