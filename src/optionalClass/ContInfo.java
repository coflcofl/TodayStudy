package optionalClass;

class ContInfo { //회사 정보에 속하는 회사 연락처
    String phone; //null일 수 있음
    String adrs; //null일 수 있음

    public ContInfo(String ph, String ad) {
        phone = ph;
        adrs = ad;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdrs() {
        return adrs;
    }
}
