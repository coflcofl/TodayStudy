package classExtends.basic;

public class MobileSmartPhone {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("010-555-7777", "Nougat");
        phone.answer();
        phone.playApp();
    }
}
