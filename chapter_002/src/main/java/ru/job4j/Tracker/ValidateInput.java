package ru.job4j.tracker;

/*
* Класс обработки исключений
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 1.0
 */

public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, int[] range) {
        boolean invalide = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalide = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select right key menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.%n");
            }
        } while (invalide);
        return value;
    }
}
