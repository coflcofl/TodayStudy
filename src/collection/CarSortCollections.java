package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CarSortCollections {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1200));
        list.add(new Car(3000));
        list.add(new Car(1800));
        Collections.sort(list);

        for(Iterator<Car> itr = list.iterator(); itr.hasNext();)
            System.out.println(itr.next().toString() + "\t");

    }
}
