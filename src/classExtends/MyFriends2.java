package classExtends;

public class MyFriends2 {
    public static void main(String[] args) {
        Friend[] frns = new Friend[10];
        int cnt = 0;

        frns[cnt++] = new UnivFriend2("LEE", "Computer", "010-333-555");
        frns[cnt++] = new UnivFriend2("SEO", "Electronic", "010-222-444");
        frns[cnt++] = new CompFriend2("YOON", "R&D 1", "02-123-999");
        frns[cnt++] = new CompFriend2("PARK", "R&D 2", "02-321-777");

        //모든 동창 및 동료의 정보 전체 출력
        for(int i=0; i<cnt; i++) {
            frns[i].showInfo(); //오버라이딩 한 메소드 출력
            System.out.println();
        }
    }
}
