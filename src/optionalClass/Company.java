package optionalClass;

class Company { //친구 정보에 속하는 회사 정보
    String cName;
    ContInfo cInfo; //null일 수 있음

    public Company(String cn, ContInfo ci) {
        cName = cn;
        cInfo = ci;
    }

    public String getCName() {
        return cName;
    }

    public ContInfo getCInfo() {
        return cInfo;
    }
}
