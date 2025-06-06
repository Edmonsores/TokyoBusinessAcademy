#Fail-Mon-01
f = open('students3.txt', encoding='utf-8')
Ed = f.read()
print(Ed)
f.close()

f = open('students3.txt', 'a', encoding='utf-8')
txt = '''柴田，100，40，65
古川，83，81，74'''
f.write(txt)
f.close()

f = open('students3.txt', encoding='utf-8')
txt = f.readlines()
f.close()

student_list = []
for line in txt:
    line = line.strip() 
    student_list.append(line)

print(student_list)

