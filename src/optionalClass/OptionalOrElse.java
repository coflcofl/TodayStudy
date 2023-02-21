package optionalClass;

import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {
        //Optional<String> os1 = Optional.empty();
        Optional<String> os1 = Optional.ofNullable(null);
        Optional<String> os2 = Optional.of("So Basic");

        String s1 = os1.map(o -> o.toString())
                       .orElse("Empty");
        String s2 = os2.map(o -> o.toString())
                       .orElse("Empty");

        System.out.println(s1);
        System.out.println(s2);
    }
}
