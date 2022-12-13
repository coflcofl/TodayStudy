package interfaceEx;

interface Printable2 {
    static void printLine(String str) {
        System.out.println(str);
    }

    default void print(String doc) {
        printLine(doc); //인터페이스의 static 메소드 호출
    }
}
