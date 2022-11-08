package methodOverloading;

public class SimpleBox {
    private int data;

    SimpleBox(int data) {
        this.data = data; //이 문장이 속한 인스턴스
    }

    void setData(int data) {
        this.data = data;
    }

    int getData() {
        return this.data;
    }
}
