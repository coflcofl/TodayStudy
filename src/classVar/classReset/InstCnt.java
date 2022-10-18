package classVar.classReset;

class InstCnt {
    static int instNum = 100; //클래스 변수(static 변수), 클래스 변수의 정상적인 초기화 방법

    InstCnt() { //생성자
        instNum = 0; //클래스 변수의 초기화가 아니다! -> 인스턴스가 생성될 때마다 매번 값이 0으로 바뀜

        instNum++; //static으로 선언된 변수의 값 증가
        System.out.println("인스턴스 생성: " + instNum);
    }
}
