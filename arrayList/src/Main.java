import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

//Martin Ramirez
//March 10 2025


import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    library music = new library();
    boolean go = true;
    music.addSong("Happy Birthday ");
    music.addSong("In Bloom ");
    music.addSong("Creep ");

    while(go){
        //Choices user can pick depending on what they want to do.
        Scanner choice = new Scanner(System.in);
        System.out.println("""
                1)Add Song 
                2)Remove Song 
                3)Quit
                4)Display Library
                5)Shuffle Library """);
        System.out.println(choice);
        int selection = choice.nextInt();
        //allows the user to add music to the list.
        if (selection == 1) {
            choice = new Scanner(System.in);
            System.out.print("enter song: ");
            String musicAdd = choice.nextLine();
            music.addSong(musicAdd);
        }
        //allows the user to remove music from the list.
        else if(selection == 2){
            choice = new Scanner(System.in);
            System.out.print("What would you like to remove?: ");
            String musicRemove = choice.nextLine();
            music.removeSong(musicRemove);
        }
        //allows users to quit the program.
        else if(selection == 3){
            choice = new Scanner(System.in);
            go = false;
        }
        //allows the user to view the list.
        else if (selection == 4) {
            music.display();
        }
        //shuffles the music in array list.
        else if (selection == 5){
            choice = new Scanner(System.in);

        }
    }
    }
}
