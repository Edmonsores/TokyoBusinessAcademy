#P-213
import re

f=open('test-result.txt',encoding='utf-8')
student=f.readline()
math=[]
while student !='':
    mo=re.search(r'数学:([0-9]+)点',student)
    math +=list(mo.groups())
    student=f.readline()
f.close()
print(math)