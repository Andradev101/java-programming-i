public class Bird {
    
    private String name;
    private String latinName;
    private int observationCounter;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCounter = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservationCounter() {
        return observationCounter;
    }
    
    public void addObservation() {
        this.observationCounter++;
    }

    //helpers
    public Boolean isValid() {
        if(this.name.isEmpty() || this.latinName.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return getName()+" (" + getLatinName() + "): " + getObservationCounter() + 
        (getObservationCounter() == 1? " observation" : " observations");
    }
}
