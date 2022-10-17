package encapsulation.badEncapsulation;

class BadEncapsulation {
    public static void main(String[] args) {
        ColdPatient suf = new ColdPatient();

        //콧물 캡슐 구매 후 복용
        suf.takeSinivelCap(new SinivelCap());

        //재채기 캡슐 구매 후 복용
        suf.takeSneezeCap(new SneezeCap());

        //코막힘 캡슐 구매 후 복용
        suf.takeSnuffleCap(new SnuffleCap());
    }
}
