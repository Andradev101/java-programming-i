import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        return this.personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {
        if(isEmpty()) {
            return null;
        }
        Person shortest = new Person("nameless", Integer.MAX_VALUE);
        for(Person person : this.personList) {
            if(person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if(isEmpty()) {
            return null;
        }
        Person toRemove = this.shortest();
        this.personList.remove(toRemove);

        return toRemove;
    }
}
