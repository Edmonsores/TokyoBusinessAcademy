'''
p-154 
ファイル名：List 8-8
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
print('生徒名',stu1.name)
print('数学',stu1.math)
print('英語',stu1.english)
print('国語',stu1.japanese)

stu1.japanese = 75
print('更新後の国語',stu1.japanese)
      
