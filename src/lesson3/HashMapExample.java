package lesson3;

import java.util.*;

public class HashMapExample {
    public static void main (String... args) {
        Map<Integer, String> map = new TreeMap<>(); // HashMap уникальность по ключю, порядок не остлеживается // LinkedHashMap порядок по занечению в мар //  TreeMap сортировка по ключу

        map.put(1, "K");
        map.put(2, "s");
        map.put(4, "d");
        map.put(3, "t");

        for (String x : map.values()){
            System.out.println(x);
        }

        for (int i = 0; i < map.size();i++){
            System.out.println(map);
        }

        Set<String> list = new HashSet<String>();
        list.add("1");
        list.add("A");
        list.add("d");
        list.add("A");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {

            String str =
            iter.next();
            if (str.equals("1")) {
                iter.remove();
            }
        }System.out.println(list);

        map.forEach((k,v) ->  System.out.println(k + "---" + v));

        String x_cod = new String("Миша") ;
        String y_cod = new String("Миша") ;
        System.out.println(x_cod.hashCode() + "   " +  y_cod.hashCode());





    }

    private void notErr(Map<String,Integer> map){

    }
}
