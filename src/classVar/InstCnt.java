package classVar;

class InstCnt {
    static int instNum = 0; //클래스 변수(static 변수)

    InstCnt() { //생성자
        instNum++; //static으로 선언된 변수의 값 증가
        System.out.println("인스턴스 생성: " + instNum);
    }
}
