package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ECarSortCollection {
    public static void main(String[] args) {
        List<ECar> list = new ArrayList<>();
        list.add(new ECar(1200, 99));
        list.add(new ECar(3000, 55));
        list.add(new ECar(1800, 87));
        Collections.sort(list);

        for(Iterator<ECar> itr = list.iterator(); itr.hasNext();)
            System.out.println(itr.next().toString() + "\t");
    }
}