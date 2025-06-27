from StudentList import StudentCard

# Subclass for IT students
class ItStudentCard(StudentCard):
    def __init__(self, id):
        self.attendance = 0
        self.attendance_rate = 0.0
        super().__init__(id, "IT学科")

    def set_attendance(self, count):
        self.attendance = count
        self.attendance_rate = (count / 15) * 100

    def print_info(self):
        super().print_info()
        print(f"出席数：{self.attendance}")
        print(f"出席率：{self.attendance_rate}%")
