package array;

public class Box {
    private String contents;
    private int boxNum;

    Box(int num, String cont) {
        boxNum = num;
        contents = cont;
    }

    public int getBoxNum() {
        return boxNum;
    }
    public String toString() {
        return contents;
    }
}
