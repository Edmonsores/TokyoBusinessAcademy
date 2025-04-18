'''
p-153
ファイル名：List 8-7
'''

class Student:
    #初期化用メソッド - Initialization method
    def __init__ (self, in_name='', in_math=0, in_eng=0, in_jpn=0):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn

#メイン
stu1=Student('佐藤', 90, 60, 70)
print(type(stu1))
