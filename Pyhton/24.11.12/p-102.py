'''
P-102 ファイル名：jisho04
'''

dct = {101: 'abc', 102: 'xyz', 103: [10, 30, 20]}
print(dct.get(101))
print(dct.get(999))
print(dct.get(999, 'ありません'))


'''
P-102 ファイル名：jisho05
'''

dct = {101: 'abc', 102: 'xyz', 103: [10, 30, 20]}
dct[103] = 'ABC'
dct[201] = 'KHDA'
print(dct)
