package optionalClass;

class Friend {
    String name;
    Company cmp; //null 일 수 있음

    public Friend(String n, Company c) {
        name = n;
        cmp = c;
    }

    public String getName() {
        return name;
    }

    public Company getCmp() {
        return cmp;
    }
}
