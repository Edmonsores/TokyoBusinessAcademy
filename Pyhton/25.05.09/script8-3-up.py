class Student:
    def __init__(self, in_name, in_math, in_eng, in_jpn):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn

    def show_detail(self):
        print('名前:', self.name)
        print('数学:', self.math)
        print('英語:', self.english)
        print('国語:', self.japanese)

    def get_total(self):
        return self.math + self.english + self.japanese

    def get_average(self):
        return self.get_total() / 3


def main():
    students = []

    for i in range(5):
        name = input('生徒名を入力してください➞')
        math = int(input('数学の点数を入力してください➞'))
        english = int(input('英語の点数を入力してください➞'))
        japanese = int(input('国語の点数を入力してください➞'))

        stu = Student(name, math, english, japanese)
        students.append(stu)

    name1 = input('名前を入力してください：')
    flg = True
    for stu in students:
        if name1 == stu.name:
            stu.show_detail()
            print('合計点:', stu.get_total())
            print('平均点:', stu.get_average())
            flg = False
            break

    if flg:
        print('存在しません')



main()

