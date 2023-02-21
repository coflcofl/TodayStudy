package optionalClass;

import java.util.Optional;

public class OptionalFlatMap {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("Optional String");
        Optional<String> os2 = os1.map(o -> o.toUpperCase());
        System.out.println(os2.get());

        Optional<String> os3 = os1.flatMap(o -> Optional.of(o.toLowerCase()));
        System.out.println(os3.get());
    }
}
