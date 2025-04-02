

'''
P - 121 ファイル名：List6-11
'''

dct = {101:'abc', 102:'xyz', 103: [10,30,20]}
for k in dct:
    print(k, dct[k])


'''
P - 121 ファイル名：List6-12
'''

dct = {101:'abc', 102:'xyz', 103: [10,30,20]}
for kv in dct.items():
    print(kv)

'''
P - 121 ファイル名：List6-13
'''

dct = {101:'abc', 102:'xyz', 103: [10,30,20]}
for k, v in dct.items():
    print(k, v)
