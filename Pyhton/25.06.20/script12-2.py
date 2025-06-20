#P-217
import re
f = open('students.txt', encoding='utf-8')
list1 = []
print('students.txtの内容をリストに格納します')
line1 = f.readline()
while line1 != '':
    if re.search(r'^#', line1) is None:
        list1.append(line1)
    line1 = f.readline()
print(list1)
f.close()