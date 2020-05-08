import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();

        for (int i = 0; i< 3;i++){
            System.out.println("Enter artists: ");
            String artist = sc.nextLine();//modify program to prompt user for an artist
            System.out.println("Enter Title: ");
            String title = sc.nextLine(); //modify program to prompt user for a title
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }
        System.out.println("\n******* Artist Information ********");
        //print all the songs in the array list
        for(Song song: songs){
            System.out.println(song.display());
        }
        //look for blue and print if found
       // System.out.println("\n*********** I found: ***********");
        String titleToFind = "Purple Rain";
        for (Song song: songs){
            if (song.getTitle().equals(titleToFind)){
                //System.out.println(song.display());
                System.out.printf("*********** I found ***********\n %s \r\n",song.display());
            }
        }
    }
}
