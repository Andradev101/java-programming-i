import java.util.ArrayList;

public class BirdDatabase {
    
    private ArrayList<Bird> birdDatabase = new ArrayList<>();
    
    public void addBird(Bird bird) {
        if(bird.getName().isEmpty() || bird.getLatinName().isEmpty()) {
            return;
        }
        this.birdDatabase.add(bird);
    }

    public String listBirds() {
        String outString = "";
        for (Integer i = 0; i < this.birdDatabase.size(); i++) {
            outString += birdDatabase.get(i);
            if(i == this.birdDatabase.size() - 1) {
                break;
            }
            outString += "\n";
        }
        return outString;
    }

    public Bird getBirdByName(String searchKey) {
        if(this.birdDatabase.isEmpty()){
            return null;
        }
        
        for (Bird bird : birdDatabase) {
            if(bird.getName().equalsIgnoreCase(searchKey)) {
                return bird;
            }
        }
        return null;
    }
}
