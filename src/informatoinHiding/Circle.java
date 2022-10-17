package informatoinHiding;

class Circle {
    //double rad = 0; //원의 반지름
    private double rad = 0; //정보 은닉 -> 클래스 내부 접근만 허용
    final double PI = 3.14;

    public Circle(double r) {
        setRad(r);
    }

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return;
        }

        rad = r;
    }

    public double getRad() {
        return rad;
    }

    public double getArea() {
        return (rad * rad) * PI;
    }
}
