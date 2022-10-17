package informatoinHiding;

class UnsafeCircle {
    public static void main(String[] args) {
        Circle c = new Circle(1.5);
        System.out.println(c.getArea()); //7.065

        c.setRad(2.5);
        System.out.println(c.getArea()); //19.625
        c.setRad(-3.3);
        System.out.println(c.getArea()); //0
        //c.rad = -4.5; // 정보 은닉에 어긋나는 문법
        //System.out.println(c.getArea());

    }
}
