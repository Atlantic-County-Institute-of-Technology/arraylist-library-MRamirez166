import java.util.ArrayList;

public class library {
    //initiating arraylist.
    private ArrayList<String> music = new ArrayList<String>();
    public void addSong(String music){
        this.music.add(music);
    }
    //loop that runs the same amount of times as the length of choices.
    public void display() {
        for(int i = 0; i < music.size(); i++) {
            System.out.print(music.get(i));
        }
    }
    /*
    function that gives users the ability to remove music
    as long as it is contained in the list.
    */
    public void removeSong(String remove) {
        if (music.contains(remove)) {
            music.remove(remove);
        }
        //if it is not in the list display an error message.
        else {
            System.out.print("Error: Does not exist.");
        }
    }
    //shuffles all music contained within the arraylist.
    public void shuffleSong(String shuffle){
        music.random();
    }
}


