package objectClass;

public class ObjectFinalize {
    public static void main(String[] args) {
        Person p1 = new Person("Yoon");
        Person p2 = new Person("Park");
        p1 = null; //참조대상을 가비지 컬렉션의 대상으로 만듦
        p2 = null; //참조대상을 가비지 컬렉션의 대상으로 만듦

        System.gc();
        System.runFinalization();

        System.out.println("end of program");
    }
}
