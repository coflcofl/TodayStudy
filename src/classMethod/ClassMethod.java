package classMethod;

class ClassMethod {
    public static void main(String[] args) {
        NumberPrinter.showInt(20); //클래스 이름을 통한 클래스 메소드

        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15); //인스턴스 이름을 통한 클래스 메소드 호출
        np.setMyNumber(75);
        np.showMyNumber();
    }
}
