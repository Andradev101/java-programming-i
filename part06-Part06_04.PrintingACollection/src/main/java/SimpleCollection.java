
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        String output = "The collection " + this.name + " is empty.";
        
        if(this.elements.isEmpty()) {
            return output;
        }

        String elementState = getElements().size() > 1 ? "elements" : "element";

        output = "The collection " + this.name +" has " + getElements().size() + " " + elementState + ":\n";
        for(String element : this.elements) {
            output += element;
            if(this.elements.size() > 1){
                output += "\n";
            }
        }
        
        return output;
    }
}
