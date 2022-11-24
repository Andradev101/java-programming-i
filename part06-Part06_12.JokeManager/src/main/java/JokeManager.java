import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokeList = new ArrayList<>();
    
    public JokeManager() {

    }

    public void addJoke(String joke) {
        if(joke.isEmpty()) {
            return;
        }
        this.jokeList.add(joke);
    }

    public String drawJoke() {
        if(this.jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random random = new Random();
        return this.jokeList.get(random.nextInt(this.jokeList.size()));
    }

    public void printJokes() {
        if(this.jokeList.isEmpty()) {
            return;
        }
        String output = "";

        for(Integer i = 0; i < this.jokeList.size(); i++) {
            output += this.jokeList.get(i);
            if(this.jokeList.size() - 1 != i) {
                output += "\n";
            }
        }

        System.out.println(output);
    }
}
