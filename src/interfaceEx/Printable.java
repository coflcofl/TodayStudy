package interfaceEx;

interface Printable {
    public void print(String doc);
    default void printCMYK(String doc) {} //인터페이스의 디폴트 메소드
}
