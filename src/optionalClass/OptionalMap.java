package optionalClass;

import java.util.Optional;

public class OptionalMap {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("Optinal String");
        Optional<String> os2 = os1.map(o -> o.toUpperCase());
        System.out.println(os2.get());

        Optional<String> os3 = os1.map(o -> o.replace(' ', '_'))
                                  .map(o -> o.toLowerCase());
        System.out.println(os3.get());
    }
}
