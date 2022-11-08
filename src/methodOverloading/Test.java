package methodOverloading;

public class Test {
    void simple(int p1, int p2){
        System.out.println("int");
    }

    void simple(int p1, double p2) {
        System.out.println("double");
    }

    public static void main(String[] args) {
        Test test = new Test();

        test.simple(7, 'K');
    }
}
