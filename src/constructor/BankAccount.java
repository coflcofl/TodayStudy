package constructor;

class BankAccount {
    String accNumber; //계좌번호
    String ssNumber; //주민번호
    int balance; //예금잔액

    //**인스턴스 변수 = 멤버변수 = 필드 : 클래스 내에 선언된 변수
    //**인스턴스 메소드 : 클래스 내에 정의된 메소드
    //**인스턴스 변수는 같은 클래스 내에 위치한 메소드 내에서 접근이 가능하다.
    /**
     * 1. 생성자의 이름은 클래스의 이름과 동일해야 한다.
     * 2. 생성자는 값을 반환하지 않고 반환형도 표시하지 않는다.
     * 3. 인스턴스 생성의 마지막 단계는 생성자 호출이다.
     * 4. 어떠한 이유로든 생성자 호출이 생략된 인스턴스는 인스턴스가 아니다.(생성자를 생략하면 자바 컴파일러가 디폴트 생성자를 생성해준다.)
     * 5. 생성자의 용도는 아주 다양(초기화, 다른 메소드 호출 등등)
     * => 객체가 처음 생성될 때 쓰는 메소드
     */
    public BankAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔액: " + balance + "\n");
        return balance;
    }
}
