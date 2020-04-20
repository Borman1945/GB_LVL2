package lesson3;

import java.util.*;

public class TelephoneDirectory {

    private static Map<String, TreeSet<String>> tеlephoneDirectory = new TreeMap<String, TreeSet<String>>();

    public static void getPhones(String surname) {
        Set<String> checkedDirectory = new HashSet<>();

        for (String phone : tеlephoneDirectory.keySet()) {

            if (tеlephoneDirectory.get(phone).contains(surname)) {
                checkedDirectory.add(phone);
            }
        }
        System.out.println(surname + "\t" + checkedDirectory);
    }

    public static void addNewPhone(String phone, String surname) {

        if (tеlephoneDirectory.containsKey(phone)) {
            TreeSet<String> newName = tеlephoneDirectory.get(phone);
            newName.add(surname);
            tеlephoneDirectory.replace(phone, newName);
        } else {
            TreeSet<String> newName = new TreeSet<String>();
            newName.add(surname);
            tеlephoneDirectory.put(phone, newName);
        }
    }


}
