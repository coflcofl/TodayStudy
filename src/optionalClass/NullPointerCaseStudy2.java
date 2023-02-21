package optionalClass;

import java.util.Optional;

public class NullPointerCaseStudy2 {
    public static void showCompAddr(Optional<Friend> f) {
        String addr = f.map(Friend::getCmp)
                       .map(Company::getCInfo)
                       .map(ContInfo::getAdrs)
                       .orElse("There's no address information");
        System.out.println(addr);
    }

    public static void main(String[] args) {
        ContInfo ci = new ContInfo("321-444-577",  "Republic of Korea");
        Company cp = new Company("YaHo Co., Ltd.", ci);
        Friend f = new Friend("LEE SU", cp);
        showCompAddr(Optional.of(f));
    }
}
