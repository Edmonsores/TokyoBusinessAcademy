'''
p-158
ファイル名：Script8-1
'''

class Student:
    def __init__ (self, in_name='', in_math=0, in_eng=0, in_jpn=0):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn

    def show_detail(self):
        print('生徒名:',self.name)
        print('数学:',self.math)
        print('英語:',self.english)
        print('国語:',self.japanese)
        
students = []

for i in range(2):
    name = input('生徒名を入力してください➞')
    math = int(input('数学の点数を入力してください➞'))
    english = int(input('英語の点数を入力してください➞'))
    japanese = int(input('国語の点数を入力してください➞'))

    stu=Student(name, math, english, japanese)
    students.append(stu)              

for i, stu in enumerate(students):
    print("＜生徒",i+1,"＞")
    stu.show_detail()
