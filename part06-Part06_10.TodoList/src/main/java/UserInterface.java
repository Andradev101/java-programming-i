import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {

        final String COMMAND_STOP = "stop";
        final String COMMAND_ADD = "add";
        final String COMMAND_LIST = "list";
        final String COMMAND_REMOVE = "remove";

        while (true) {
            System.out.println("Command: ");
            String commandInput = scanner.nextLine();

            boolean operationExists = operationExists(commandInput);
            if (!operationExists) {
                System.out.println("Unknown command");
                continue;
            }

            if (commandInput.toLowerCase().equals(COMMAND_STOP)) {
                return;
            }

            if (commandInput.toLowerCase().equals(COMMAND_ADD)) {
                addCommand();
            }

            if (commandInput.toLowerCase().equals(COMMAND_REMOVE)) {
                removeCommand();
            }

            if (commandInput.toLowerCase().equals(COMMAND_LIST)) {
                this.todoList.print();
            }
        }
    }

    public boolean operationExists(String input) {

        final String COMMAND_STOP = "stop";
        final String COMMAND_ADD = "add";
        final String COMMAND_LIST = "list";
        final String COMMAND_REMOVE = "remove";

        if (!input.toLowerCase().equals(COMMAND_STOP) &&
                !input.toLowerCase().equals(COMMAND_ADD) &&
                !input.toLowerCase().equals(COMMAND_LIST) &&
                !input.toLowerCase().equals(COMMAND_REMOVE)) {
            return false;
        } else {
            return true;
        }
    }

    private void addCommand() {
        System.out.println("To add: ");
        String task = scanner.nextLine();

        this.todoList.add(task);
    }

    private void removeCommand() {
        System.out.println("Which one is removed? ");
        Integer remove = Integer.valueOf(scanner.nextLine());

        this.todoList.remove(remove);
    }
}
