import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String stackElement) {
        this.stack.add(stackElement);
    }

    public String take() {
        String topmost = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return topmost;
    }

    public ArrayList<String> values() {
        return this.stack;
    }
}
