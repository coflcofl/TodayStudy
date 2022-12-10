package classExtends.basic;

public class MobileSmartPhoneRef {
    public static void main(String[] args) {
        SmartPhone ph1 = new SmartPhone("010-555-7777", "Nougat");
        MobilePhone ph2 = new SmartPhone("010-999-3333", "Nougat");

        ph1.answer();
        ph1.playApp();
        System.out.println();

        ph2.answer();
    }
}
