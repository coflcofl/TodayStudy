package enumeration;

enum Person4 {
    MAN, WOMAN;

    @Override
    public String toString() {
        return "I am a dog person";
    }
}

public class EnumConst {
    public static void main(String[] args) {
        System.out.println(Person4.MAN);
        System.out.println(Person4.WOMAN);
    }
}