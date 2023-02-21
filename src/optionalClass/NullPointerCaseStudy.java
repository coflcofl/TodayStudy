package optionalClass;

public class NullPointerCaseStudy {
    public static void showCompAddr(Friend f) {
        String addr = null;

        if(f != null) {
            Company com = f.getCmp();

            if(com != null) {
                ContInfo info = com.getCInfo();

                if(info != null) {
                    addr = info.getAdrs();
                }
            }
        }

        if(addr != null) {
            System.out.println(addr);
        } else {
            System.out.println("There's no address information.");
        }
    }

    public static void main(String[] args) {
        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
        Company cp = new Company("YaHo Co., Ltd.", ci);
        Friend frn = new Friend("LEE SU", cp);
        showCompAddr(frn);
    }
}
