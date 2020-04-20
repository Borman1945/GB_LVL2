package lesson3;

import java.util.*;

public class SetEaxample {
    public static void main(String... args){
        Set<String> set = new TreeSet<>();  //HashSet - уникальные данные, нет порядка // LinkedHashSet уникальные упорядочные по факту добавления // TreeSet упорядоченные в зависмости от типа

        set.add("Альфа");
        set.add("Omega");
        set.add("Betta");
        set.add("Omega");

        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);list.add(3);list.add(3);
        for(Integer number : list){

        }

        list.forEach((Integer value) -> System.out.println(value));


    }
}
