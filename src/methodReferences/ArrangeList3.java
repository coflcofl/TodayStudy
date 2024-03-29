package methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList3 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,3,5,7,9);
        ls = new ArrayList<>(ls);
        JustSort js = new JustSort();

        Consumer<List<Integer>> c = e -> js.sort(e);
        c.accept(ls);
        System.out.println(ls);
    }
}
