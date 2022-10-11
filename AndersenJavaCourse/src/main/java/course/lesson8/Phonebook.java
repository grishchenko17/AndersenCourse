package course.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    private Map<Integer, String> phonebook;
    Phonebook() {
        phonebook = new HashMap<>();
    }
    public void addNote(int num, String lastname) {
        phonebook.put(num, lastname);
    }
    public void getPhoneNumber(String lastname) {
        if(phonebook.containsValue(lastname)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(lastname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("There is no user in the phonebook with the such name!");
        }
    }
    }
