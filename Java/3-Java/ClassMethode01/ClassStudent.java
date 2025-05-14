
public class ClassStudent {
	 static int idCounter = 1000;

	    String name;
	    int id;
	    int school; // 1:小, 2:中, 3:高
	    int grade;

	    public ClassStudent(String name, int school, int grade) {
	        this.name = name;
	        this.school = school;
	        this.grade = grade;
	        this.id = idCounter++;
	    }

	    public void displayInfo() {
	        System.out.println("会員番号：" + id);
	        System.out.println("名前：" + name);
	        System.out.println("学校：" + getSchoolName());
	        System.out.println("学年：" + grade);
	        System.out.println(" ");
	    }

	    public int getSchool() {
	        return school;
	    }

	    //Name the school
	    private String getSchoolName() {
	        switch (school) {
	            case 1: return "小学校";
	            case 2: return "中学校";
	            case 3: return "高校";
	            default: return "不明";
	        }
	    }

	    //percentage of Middle School students
	    public static void displayMiddleSchoolPercentage(int juniorCount, int totalStudents) {
	        if (totalStudents > 0) {
	            int percent = (int) ((double) juniorCount / totalStudents * 100);
	            System.out.println("中学生の割合: " + percent + "%");
	        } else {
	            System.out.println("登録された学生がいません。");
	        }
	    }


}
