package optionalClass;

public class IfElseOptional {
    public static void main(String[] args) {
        ContInfo ci = new ContInfo(null, "Republic of Korea");
        String phone;
        String addr;

        if(ci.phone != null) {
            phone = ci.getPhone();
        } else {
            phone = "There is no phone number";
        }

        if(ci.adrs != null) {
            addr = ci.getAdrs();
        } else {
            addr = "There is no address.";
        }

        System.out.println(phone);
        System.out.println(addr);
    }
}
