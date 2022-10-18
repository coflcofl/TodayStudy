package classMethod.calculator;

class SimpleCalculator {
    static final double PI = 3.1415;
    double nonStatic = 1.2;

    double add(double n1, double n2) {
        return n1 + n2;
    }

    double min(double n1, double n2) {
        return n1 - n2;
    }

    double calCircleArea(double r) {
        return PI * r * r;
    }

    double calCirclePeri(double r) {
        return PI * (r * 2);
    }
}
