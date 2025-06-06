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