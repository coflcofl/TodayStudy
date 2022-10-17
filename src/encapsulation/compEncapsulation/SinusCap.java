package encapsulation.compEncapsulation;

class SinusCap {
    SinivelCap siCap = new SinivelCap();
    SneezeCap szCap = new SneezeCap();
    SnuffleCap sfCap = new SnuffleCap();

    void take() {
        siCap.take();
        szCap.take();
        sfCap.take();
    }
}
