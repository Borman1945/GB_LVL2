package lesson3;

import java.util.*;

public class HomeWorkTask1 {

    public static void main(String... args) {


        List<String> arr = new ArrayList(Arrays.asList("Misha","Hope","Nastya","Dasha","Yura","Azim","Vitya","Koshka",
                "Misha","Dima","Nastya","Dasha","Yura","Azim","Vitya","Koshka","Koshka","Koshka","Koshka"));

        Set<String> set = new HashSet<String>();

        arr.forEach(arrStr -> set.add(arrStr));

        set.forEach(setStr -> System.out.println(setStr));

        Map<String,Integer> map = new LinkedHashMap<String, Integer>();

        Iterator<String> iter = arr.iterator();

        while(iter.hasNext()){
            Integer i = 1;
            String mapKey = iter.next();
            if ((map.containsKey(mapKey))) {
                map.replace(mapKey, map.get(mapKey) + 1);
            } else {
                map.put(mapKey, i);
            }
        }

        System.out.println(map);



    }

}
