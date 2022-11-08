package methodOverloading;

class Person {
    private int regiNum; //주민등록번호
    private int passNum; //여권번호

    Person(int rnum, int pnum) {
        regiNum = rnum;
        passNum = pnum;
    }

    Person(int rnum) {
        this(rnum, 0); //Person(int rnum, int pnum) 호출
        //regiNum = rnum;
        //passNum = 0;
    }

    void showPersonalInfo() {
        System.out.println("주민등록 번호: " + regiNum);

        if(passNum != 0) {
            System.out.println("여권 번호: " + passNum + "\n");
        } else {
            System.out.println("여권을 가지고 있지 않습니다. \n");
        }
    }
}
