package classExtends;

public class MyFriends {
    public static void main(String[] args) {
        //대학 동창의 관리를 위한 배열과 변수
        UnivFriend[] ufrns = new UnivFriend[5];
        int ucnt = 0;

        //직장 동료의 관리를 위한 배열과 변수
        CompFriend[] cfrns = new CompFriend[5];
        int ccnt = 0;

        //대학 동창의 정보 저장
        ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
        ufrns[ucnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");

        //직장 동료의 정보 저장
        cfrns[ccnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
        cfrns[ccnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

        //모든 동창 및 동료의 정보 전체 출력
        for(int i=0; i<ucnt; i++) {
            ufrns[i].showInfo();
            System.out.println();
        }
        for(int i=0; i<ccnt; i++) {
            cfrns[i].showInfo();
            System.out.println();
        }
    }
}
