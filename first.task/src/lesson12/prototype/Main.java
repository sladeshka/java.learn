package lesson12.prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Long> namesAndNums = new HashMap<>();
        namesAndNums.put("John", 12367132L);
        namesAndNums.put("Anna", 12367132L);
        namesAndNums.put("Katie", 12367132L);
        namesAndNums.put("Bob", 12367132L);

        Phonebook phonebook = new Phonebook(namesAndNums);
        System.out.println(phonebook);

        PhonebookFactory phonebookFactory = new PhonebookFactory(phonebook);
        Phonebook clonePhonebook = phonebookFactory.clonePhonebook();
        System.out.println(clonePhonebook);

        try {
            Phonebook clone = (Phonebook)phonebook.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
