#p-200 List 11-11
f = open('writesample2.txt', 'w', encoding='utf-8')
txt = ['abc', 'def', 'efg']
f.writelines(txt)
f.close()