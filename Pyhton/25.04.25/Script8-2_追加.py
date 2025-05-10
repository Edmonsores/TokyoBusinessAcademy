'''
p-158
ファイル名：Script8-2
'''

class Student:
    def __init__ (self, in_name='', in_math=0, in_eng=0, in_jpn=0):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn

    def show_detail(self):
        print('生徒名:', self.name)
        print('数学:', self.math)
        print('英語:', self.english)
        print('国語:', self.japanese)

    def get_total_score(self):
        return self.math + self.english + self.japanese

    def get_average_score(self):
        return self.get_total_score() / 3

    def get_biggest_score(self): 
        return max(self.math, self.english, self.japanese)

    def search_max(score_list):
        max_score = 0
        for student in score_list:
            total = student.get_total_score()
            if total > max_score:
                max_score = total
        return max_score


# 生徒情報の入力とインスタンス作成
students = []

for i in range(3):
    name = input('生徒名を入力してください➞')
    math = int(input('数学の点数を入力してください➞'))
    english = int(input('英語の点数を入力してください➞'))
    japanese = int(input('国語の点数を入力してください➞'))

    stu = Student(name, math, english, japanese)
    students.append(stu)

# 生徒ごとの詳細表示
for i, stu in enumerate(students):
    print("＜生徒", i+1, "＞")
    stu.show_detail()
    max_score = stu.get_biggest_score()
    print('最高点:', max_score)
    ts1 = stu.get_total_score()
    print('合計点:', ts1)
    ts2 = stu.get_average_score()
    print('平均点:', ts2)
    print()

# 全体の最高点を表示
high_score = Student.search_max(students)  # 修正
print('全体の最高点：', high_score, '点')

