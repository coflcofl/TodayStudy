package optionalClass;

import java.util.Optional;

public class OptionalBase {
    public static void main(String[] args) {
        Optional<Integer> oi1 = Optional.of(3);
        Optional<Integer> oi2 = Optional.empty();

        System.out.print("[Step 1.] : ");
        oi1.ifPresent(o -> System.out.print(o + "\t"));
        oi2.ifPresent(o -> System.out.print(o));
        System.out.println();

        System.out.print("[Step 2.] : ");
        System.out.print(oi2.orElse(100) + "\t");
        System.out.print(oi2.orElse(100) + "\t");
        System.out.println();
    }
}
