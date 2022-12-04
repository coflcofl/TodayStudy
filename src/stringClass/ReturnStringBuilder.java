package stringClass;

public class ReturnStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append(45678);

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());

        //인덱스 0~4까지의 문자 삭제
        sb2.delete(0, 5);

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());

        //참조 값의 비교
        if(sb1 == sb2) {
            System.out.println("같은 인스턴스 참조");
        } else {
            System.out.println("다른 인스턴스 참조");
        }
    }
}
