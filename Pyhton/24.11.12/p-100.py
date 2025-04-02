'''
P-100 ファイル名：jisho01
'''

dct = {101: 'abc', 102: 'xyz', 103: [10, 30, 20]}
print(dct)

'''
P-100 ファイル名：jisho02
se repetir a chave, o ultimo valor subescreve os anteriores
'''

dct = {101: 'abc', 102: 'xyz', 101: [10, 30, 20]}
print(dct)
