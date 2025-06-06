#P-204 Script11-3
f = open('student.txt', encoding='utf-8')
listEd = f.readlines()
print('student.txtの内容をリストに格納します')
print(listEd)
f.close()