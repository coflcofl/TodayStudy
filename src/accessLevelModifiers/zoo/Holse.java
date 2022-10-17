package accessLevelModifiers.zoo;

class Holse {
    private  int numLeg = 2; //클래스 내부에서만 접근 가능

    public void md1() {
        System.out.println(numLeg); //접근가능
        md2(); //호출가능
    }

    private void md2() {
        System.out.println(numLeg); //접근가능
    }

    void md3() {
        System.out.println(numLeg); //접근가능
        md2(); //호출가능
    }
}
