'''
p-141 - cook
List7-19
'''

def cook(name, count=1, cold=False):
    temp = '熱々の'
    if cold:
        temp = '冷たい'
        
    print ('料理をはじめます')
    print(str(count)+ '人分' + name + 'を作ります')


cook('ハンバーグ', cold=False, count=2)
