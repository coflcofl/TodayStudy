package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2); //대문자, 소문자 구분없이 비교
    }
}
public class StringComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOT");
        list.add("APPLE");
        list.add("BOX");

        StrComp cmp = new StrComp(); //정렬과 탐색의 기준
        Collections.sort(list, cmp);
        int idx = Collections.binarySearch(list, "Robot", cmp);
        System.out.println(list.get(idx));
    }
}
