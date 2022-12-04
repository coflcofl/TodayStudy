package stringClass;

public class CompString {
    public static void main(String[] args) {
        String str1 = "Lexicographically";
        String str2 = "lexicographically";
        int cmp;

        if(str1.equals(str2)) {
            System.out.println("두 문자열 같음");
        } else {
            System.out.println("두 문자열 다름");
        }

        cmp = str1.compareTo(str2);

        if(cmp == 0) {
            System.out.println("두 문자열 일치");
        } else if(cmp < 0) {
            System.out.println("사전의 앞에 위치하는 문자: " + str1);
        } else{
            System.out.println("사전의 앞에 위치하는 문자: " + str2);
        }

        if(str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("두 문자열 같음");
        } else {
            System.out.println("두 문자열 다름");
        }
    }
}
