from studentclass import Student
from searchmethod import search_student

name1=input('名前を入力してください：')
stu = search_student(name1)
if stu is not None:
    stu.show_detail()
    print('合計点:', stu.get_total())
    print('平均点:', round(stu.get_average(), 2))  # Rounded to 2 decimal places
else:
    print('存在しません')
