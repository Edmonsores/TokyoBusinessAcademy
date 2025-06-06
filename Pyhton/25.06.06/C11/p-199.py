#p-199 List 11-9
f = open('writesample.txt', 'w', encoding='utf-8')
txt = '''abc
def
efg'''
f.write(txt)
f.close()