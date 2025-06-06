#P-203 Script11-2

name = input('生徒名を入力してくださいー＞')
math = input('数学の点数を入力してくださいー＞')
english = input('英語の点数を入力してくださいー＞')
japanese = input('国語の点数を入力してくださいー＞')

fw = open('student.txt','a', encoding='utf-8')
student = '\n'+name+','+math+','+english+','+japanese+'\n'
fw.write(student)
fw.close()

print()
print('student.txtの内容')
print()

f = open('student.txt', encoding='utf-8')
Ed = f.read()
print(Ed)
f.close()