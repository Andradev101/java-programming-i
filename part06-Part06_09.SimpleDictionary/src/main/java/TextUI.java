import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionaryObj;

    public TextUI(Scanner scanner, SimpleDictionary dictionaryObj) {
        this.scanner = scanner;
        this.dictionaryObj = dictionaryObj;
    }

    public void start() {

        final String COMMAND_END = "end";
        final String COMMAND_ADD = "add";
        final String COMMAND_SEARCH = "search";

        while (true) {
            System.out.println("Command: ");
            String commandInput = this.scanner.nextLine();

            if (!commandInput.toLowerCase().equals(COMMAND_END) &&
                    !commandInput.toLowerCase().equals(COMMAND_ADD) &&
                    !commandInput.toLowerCase().equals(COMMAND_SEARCH)) {
                System.out.println("Unknown command");
                continue;
            }

            if (commandInput.toLowerCase().equals(COMMAND_END)) {
                System.out.println("Bye bye!");
                return;
            }

            if (commandInput.toLowerCase().equals(COMMAND_ADD)) {
                addCommand();
            }

            if (commandInput.toLowerCase().equals(COMMAND_SEARCH)) {
                searchCommand();
            }
        }
    }

    private void addCommand() {
        System.out.println("Word: ");
        String wordInput = this.scanner.nextLine();

        System.out.println("Translation: ");
        String translationInput = this.scanner.nextLine();

        this.dictionaryObj.add(wordInput, translationInput);
    }

    private void searchCommand() {
        System.out.println("To be translated: ");
        String toTranslateInput = this.scanner.nextLine();
        String returnedTranslation = this.dictionaryObj.translate(toTranslateInput);

        if (returnedTranslation != null) {
            System.out.println("Translation: " + this.dictionaryObj.translate(toTranslateInput));
        } else {
            System.out.println("Word " + toTranslateInput + " was not found");
        }
    }
}
