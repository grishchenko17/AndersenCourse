package course.lesson8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "Apple", "Orange", "Blueberry", "Banana", "Pineapple",
                "Strawberry", "Cherry", "Orange", "Apple", "Peach",
                "Kiwi", "Coconut", "Banana", "Passion fruit", "Orange",
                "Pomegranate", "Grapefruit", "Orange", "Pomelo", "Mandarin");


        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Default array: ");
        System.out.println(words.toString());
        System.out.println("Unique words: ");
        System.out.println(uniqueWords.toString());
        System.out.println("Frequency of occurrence of all words: ");
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(words, word));
        }


        Phonebook phonebook = new Phonebook();
        phonebook.addNote(539876345, "Potter");
        phonebook.addNote(231057565, "Potter");
        phonebook.addNote(554567636, "Dumbledore");
        phonebook.addNote(123565567, "Snape");
        phonebook.getPhoneNumber("Granger");
        phonebook.getPhoneNumber("Potter");
        phonebook.getPhoneNumber("Snape");

    }
}
