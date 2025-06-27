from StudentAttendance import ItStudentCard
from StudentGrade import OffStudentCard

def main():
    while True:
        print("\n処理を選んでください:")
        print("1: IT学科の学生")
        print("2: オフィス学科の学生")
        print("3: プログラム終了")
        choice = input("番号を入力: ")

        if choice == "1":
            student_id = input("学籍番号（4桁）を入力してください: ")
            it_student = ItStudentCard(student_id)
            count = int(input("出席数（0〜15）を入力してください: "))
            it_student.set_attendance(count)
            print("\n--- IT学科学生情報 ---")
            it_student.print_info()

        elif choice == "2":
            student_id = input("学籍番号（4桁）を入力してください: ")
            nationality = input("国籍を入力してください: ")
            off_student = OffStudentCard(student_id, nationality)
            print("3教科の点数を入力してください:")
            sub1 = int(input("科目1: "))
            sub2 = int(input("科目2: "))
            sub3 = int(input("科目3: "))
            off_student.calculate_grade_point(sub1, sub2, sub3)
            print("\n--- オフィス学科学生情報 ---")
            off_student.print_info()

        elif choice == "3":
            print("プログラムを終了します。")
            break
        else:
            print("無効な選択です。もう一度試してください。")

main()
