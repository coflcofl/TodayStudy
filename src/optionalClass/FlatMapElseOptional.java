package optionalClass;

import java.util.Optional;

class ContInfo2 {
    Optional<String> phone;
    Optional<String> adrs;

    public ContInfo2(Optional<String> ph, Optional<String> ad) {
        phone = ph;
        adrs = ad;
    }

    public Optional<String> getPhone() {
        return phone;
    }
    public Optional<String> getAdrs() {
        return adrs;
    }
}
public class FlatMapElseOptional {
    public static void main(String[] args) {
        Optional<ContInfo2> ci = Optional.of(new ContInfo2(Optional.ofNullable(null), Optional.of("Republic of Korea")));

        String phone = ci.flatMap(o -> o.getPhone())
                         .orElse("There is no phone number");
        String adrs = ci.flatMap(o -> o.getAdrs())
                        .orElse("There is no address.");
        System.out.println(phone);
        System.out.println(adrs);
    }
}
