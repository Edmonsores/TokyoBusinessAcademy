class Student:
    def __init__(self, name, math, english, japanese):
        self.name = name
        self.math = math
        self.english = english
        self.japanese = japanese

    def show_detail(self):
        print("生徒名:",self.name)
        print("数学:",self.math)
        print("英語:",self.english)
        print("国語:",self.japanese)
     