 import java.util.Scanner;
class Member {

     String name;
     int memberNo;
     int gender;
     int age;

    public Member(String name, int memberNo, int gender, int age) {
        this.name = name;
        this.memberNo = memberNo;
        this.gender = gender;
        this.age = age;
    }

    public boolean CheckNoMethod() {
        return memberNo >= 1000 && memberNo <= 3999;
    }

    public void ChangeMethod(int newMemberNo) {
        this.memberNo = newMemberNo;
    }

    public void PrintMethod() {
        System.out.println("名前: " + name);
        System.out.println("会員番号: " + memberNo);
        if (gender == 1) {
            System.out.println("性別: 男子");
        }else {
        	System.out.println("性別: 女性");
        }
        System.out.println("年齢: " + age);
        System.out.println("");
    }
}

public class section_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] members = new Member[3];

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "人目のデータを入力してください:");

            System.out.print("名前⇒ ");
            String name = scanner.nextLine();

            System.out.print("会員番号（1000～3999）⇒ ");
            int memberNo = scanner.nextInt();

            System.out.print("性別（1: 男子, 2: 女子）⇒ ");
            int gender = scanner.nextInt();

            System.out.print("年齢⇒ ");
            int age = scanner.nextInt();
            scanner.nextLine();

            members[i] = new Member(name, memberNo, gender, age);

            if (!members[i].CheckNoMethod()) {
                System.out.println("会員番号が正しくありません。正しい番号を入力してください（1000～3999）。");
                int newMemberNo;
                do {
                    System.out.print("新しい番号⇒ ");
                    newMemberNo = scanner.nextInt();
                    scanner.nextLine();
                } while (newMemberNo < 1000 || newMemberNo > 3999);
                members[i].ChangeMethod(newMemberNo);
            }
        }
        System.out.println("");
        System.out.println("登録された会員情報:");
        for (Member member : members) {
            member.PrintMethod();
        }

        scanner.close();
    }
}
