package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(1);
        tree.add(4);
        tree.add(2);
        tree.add(3);
        System.out.println("인스턴스 수: " + tree.size());

        for(Integer i : tree) {
            System.out.print(i.toString() + "\t");
        }
        System.out.println();

        for(Iterator<Integer> itr = tree.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
    }
}
