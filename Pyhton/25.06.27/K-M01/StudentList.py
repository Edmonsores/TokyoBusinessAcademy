# Super Class
class StudentCard:
    def __init__(self, id, department):
        self.id = id
        self.department = department

    def print_info(self):
        print(f"学籍番号：{self.id}")
        print(f"学科名：{self.department}")
