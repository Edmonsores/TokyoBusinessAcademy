#P-218
import re
from studentclass import Student
str1 = 'name:佐藤,math:100,english:40,japanese:65'
pattern = r'^name:(\w+),math:([0-9]+),english:([0-9]+),japanese:([0-9]+)'
mo = re.search(pattern, str1)

t1 = mo.groups()
stu = Student(t1[0], int(t1[1]), int(t1[2]), int(t1[3]))
stu.show_detail()