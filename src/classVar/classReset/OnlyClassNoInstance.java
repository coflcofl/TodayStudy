package classVar.classReset;

class OnlyClassNoInstance {
    public static void main(String[] args) {
        InstCnt.instNum -= 15; //인스턴스 생성 없이 instNum에 접근
        System.out.println(InstCnt.instNum);
    }
}
