package ru.job4j.tracker;

/*
* Класс обработки исключений
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 1.0
 */

public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalide = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalide = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select right key menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate date.");
            }
        } while (invalide);
        return value;
    }
}
