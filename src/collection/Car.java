package collection;

class Car implements Comparable<Car> {
    protected int disp; //배기량

    public Car(int d) {
        disp = d;
    }

    @Override
    public String toString() {
        return "cc: " + disp;
    }
    @Override
    public int compareTo(Car o) {
        return disp - o.disp;
    }
}