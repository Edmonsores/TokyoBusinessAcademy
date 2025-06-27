class Student:
    def __init__(self, student_id, name, python, java):
        self.student_id = student_id
        self.name = name
        self.python = python
        self.java = java
        self.average = 0
        self.performance_evaluation = ""

    def display_info(self):
        print("--- 学生の情報 ---")
        print("学籍番号:", self.student_id)
        print("氏名:", self.name)
        print("Pythonの点数:", self.python)
        print("JAVAの点数:", self.java)
        print("平均点:",self.average)
        print("成績評価:", self.performance_evaluation)

    def calculate_average(self):
        self.average = (self.python + self.java) / 2

    def calculate_evaluation(self):
        if self.python >= 80 and self.java >= 80:
            self.performance_evaluation = "A"
        elif self.python >= 80 or self.java >= 80:
            self.performance_evaluation = "B"
        else:
            self.performance_evaluation = "C"


# Main Processing
students = []

print("4人の学生の情報を入力してください:")
for i in range(4):
    print("\n--- 学生",i + 1,"---")
    
    while True:
        student_id = input("学生IDを入力してください (23001-23999):")
        try:
            student_id_num = int(student_id)
            if 23001 <= student_id_num <= 23999:
                break
            else:
                print("学生IDが無効です。23001～23999の数字を入力してください。")
        except ValueError:
            print("入力が無効です。数字の学生IDを入力してください。")

    name = input("名前を入力してください: ")

    while True:
        try:
            python_score = int(input("Pythonの点数を入力してください（0-100）: "))
            if 0 <= python_score <= 100:
                break
            else:
                print("Pythonの点数が無効です。0～100の値を入力してください。")
        except ValueError:
            print("入力が無効です。数字を入力してください。")

    while True:
        try:
            java_score = int(input("JAVAの点数を入力してください（0-100）: "))
            if 0 <= java_score <= 100:
                break
            else:
                print("JAVAの点数が無効です。0～100の値を入力してください。.")
        except ValueError:
            print("入力が無効です。数字を入力してください。")

    student = Student(student_id, name, python_score, java_score)
    student.calculate_average()
    student.calculate_evaluation()
    students.append(student)

# Find the student with the highest average
highest_average_student = students[0]
for student in students:
    if student.average > highest_average_student.average:
        highest_average_student = student

print("\n--- 平均点が最も高い学生 ---")
highest_average_student.display_info()

print("\n--- A評価の学生一覧 ---")
found_a = False
for student in students:
    if student.performance_evaluation == "A":
        student.display_info()
        found_a = True

if not found_a:
    print("A評価の学生はいません。")
