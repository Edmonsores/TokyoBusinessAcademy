import java.util.Scanner;

class Member {

    String className; 
    String name;     
    int rank;        


    public Member(String className, String name, int rank) {
        this.className = className;
        this.name = name;
        this.rank = rank;
    }


    public void display() {
        System.out.println("クラス名: " + className + ", 名前: " + name + ", ランク: " + rank);
    }
}


public class section_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Member[] members = new Member[2];

        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "人目のデータを入力してください:");


            System.out.print("クラス名 (A, B, C): ");
            String className = scanner.next();

            System.out.print("名前: ");
            String name = scanner.next();


            int rank;
            while (true) {
                System.out.print("ランク (1～20): ");
                rank = scanner.nextInt();
                if (rank >= 1 && rank <= 20) {
                    break;
                } else {
                    System.out.println("ランクは1～20の間で入力してください。");
                }
            }


            members[i] = new Member(className, name, rank);
        }

        scanner.close();


        System.out.println("\n入力されたメンバー情報:");
        for (Member member : members) {
            member.display();
        }
    }
}
