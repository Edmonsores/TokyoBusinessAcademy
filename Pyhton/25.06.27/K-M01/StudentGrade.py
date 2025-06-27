from StudentList import StudentCard

# Subclass for Office students
class OffStudentCard(StudentCard):
    def __init__(self, id, nationality):
        self.nationality = nationality
        self.grade_point = 0.0
        self.evaluation = ""
        super().__init__(id, "オフィス学科")

    def calculate_grade_point(self, sub1, sub2, sub3):
        self.grade_point = (sub1 + sub2 + sub3) / 3
        self.set_evaluation()

    def set_evaluation(self):
        if self.grade_point >= 80:
            self.evaluation = "優"
        elif self.grade_point >= 60:
            self.evaluation = "良"
        else:
            self.evaluation = "不可"

    def print_info(self):
        super().print_info()
        print(f"国籍：{self.nationality}")
        print(f"成績点：{self.grade_point}")
        print(f"成績評価：{self.evaluation}")
