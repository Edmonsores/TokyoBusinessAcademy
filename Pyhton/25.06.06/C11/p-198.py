#p-198 List 11-6
f = open('sample.txt', encoding='utf-8')
line = f.readline()
count = 1
while line != '':
    print(str(count) + '行目：', line, end='')
    line = f.readline()
    count += 1
f.close()