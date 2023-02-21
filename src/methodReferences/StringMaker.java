package methodReferences;

import java.util.function.Function;

public class StringMaker {
    public static void main(String[] args) {
        Function<char[], String> f = ar -> {
            return new String(ar);
        };
        Function<char[], String> f2 = ar2 -> new String(ar2);
        Function<char[], String> f3 = String::new;

        char[] src = {'R', 'o', 'b', 'o', 't'};
        String str = f.apply(src);
        String str2 = f2.apply(src);
        String str3 = f3.apply(src);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}
