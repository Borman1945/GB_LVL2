package lesson3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main (String... args){
        arrayListExample();
    }


        static void arrayListExample(){
            List newDataName = new ArrayList<>();
            newDataName.add("a");
            newDataName.add("d");
            newDataName.add("c");
            newDataName.add("c");
            newDataName.add("c");
            System.out.println(newDataName);
            newDataName.add(1,"!2");
            System.out.println(newDataName);
            newDataName.remove("c");
            System.out.println(newDataName);
            newDataName.remove(2);
            System.out.println(newDataName);
            System.out.println("contains a? " + newDataName.contains("a"));
            for (int i = 0; i < newDataName.size();i++){
                System.out.print(newDataName.get(i) + "\t");
            }

            for (Object arr : newDataName){
                System.out.print(arr);
            }
            newDataName = null;
        }


}
