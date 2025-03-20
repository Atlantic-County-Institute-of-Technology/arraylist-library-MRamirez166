import java.util.ArrayList;
import java.util.Scanner;

public class library {
    //Holds the music that is currently in the array list.
    public static void main(String[] args){
        ArrayList<String> music = new ArrayList<String>();
        music.add("Happy Birthday");
        music.add("In Bloom");
        music.add("Creep");
        System.out.println(music);

        //Will allow users to choose what they want to do.
        Scanner choice = new Scanner(System.in);
        System.out.println("""
                1)Add Song
                2)Remove Song
                3)Quit""");
        System.out.println(choice);
        String selection = choice.nextLine();
        System.out.println("Selection: " + selection);
    }
}
