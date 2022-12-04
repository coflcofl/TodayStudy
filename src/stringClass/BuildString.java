package stringClass;

public class BuildString {
    public static void main(String[] args) {
        //문자열 "123"이 저장된 인스턴스의 생성
        StringBuilder sb = new StringBuilder("123");

        sb.append(45678); //문자열 덧붙이기
        System.out.println(sb.toString());

        sb.delete(0, 2); //문자열 일부 삭제
        System.out.println(sb.toString());

        sb.replace(0, 3, "AB"); //문자열 일부 교체
        System.out.println(sb.toString());

        sb.reverse(); //문자열 내용 뒤집기
        System.out.println(sb.toString());

        String sub = sb.substring(2, 4);
        System.out.println(sb);
    }
}
