import java.lang.reflect.Array;
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todoList = new ArrayList<>();

    public TodoList() {

    }

    public void add(String task) {
        if(task.isEmpty()) {
            return;
        }
        todoList.add(task);
    }

    public void print() {
        for(Integer i = 0; i < this.todoList.size(); i++) {
            System.out.println((i + 1) + ": " + this.todoList.get(i));
        }
    }

    public void remove(int number) {
        if(number < 1 || number > this.todoList.size()) {
            return;
        }
        this.todoList.remove(number - 1);
        //NB! You may assume that the remove method is given a number that corresponds to a real task. 
        //The method only has to correctly work once after each print call.
    }
}
