package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for(String s : list) {
            System.out.print(s + "\t");
        }
        System.out.println();

        list.remove(0);

        for(String s : list) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
