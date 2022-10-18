package classMethod.calculator;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

class UseCalculator {
    public static void main(String[] args) {
        //객체 선언
        SimpleCalculator sc = new SimpleCalculator();
        System.out.println("3 + 4 = " + sc.add(3, 4));
        System.out.println("반지름 2.2, 원의 넓이 : " + sc.calCircleArea(2.2) + "\n");

        System.out.println("15 - 7 = " + sc.min(15, 7));
        System.out.println("반지름 5.0, 원의 둘레 : " + sc.calCirclePeri(5.0) + "\n");

        //static으로 선언
        System.out.println("static 3 + 4 = " + SimpleCalculatorStatic.add(3, 4));
        System.out.println("static 반지름 2.2, 원의 넓이 : " + SimpleCalculatorStatic.calCircleArea(2.2) + "\n");

        System.out.println("static 15 - 7 = " + SimpleCalculatorStatic.min(15, 7));
        System.out.println("static 반지름 5.0, 원의 둘레 : " + SimpleCalculatorStatic.calCirclePeri(5.0));

    }
}
