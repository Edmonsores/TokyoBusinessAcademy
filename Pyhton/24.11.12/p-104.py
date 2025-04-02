'''
P-104 ファイル名：jisho07
'''

dct = {101: 'abc', 102: 'xyz', 103: [10, 30, 20]}
if 999 in dct:
    del dct[999]
print(dct)

'''
P-104 ファイル名：jisho08
'''
dct = {101: 'abc', 102: 'xyz', 103: [10, 30, 20]}
ks = dct.keys()
print(ks)

dct[104] = 'XYZ'
print(ks)

del dct[102]
print(ks)
