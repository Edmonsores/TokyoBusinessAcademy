'''
p-155
ファイル名：List 8-9
'''

class Student:
    #初期化用メソッド - Initialization method
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

    def get_total_score(self):
        return self.math + self.english + self.japanese

    def set_math(self, new_math):
        self.math = new_math

stu1=Student('佐藤', 90, 60, 70)

stu1.show_detail()

print()
stu1.set_math(85)
stu1.show_detail()

ts1 = stu1.get_total_score()
print('合計点', ts1)
