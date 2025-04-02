'''
P-87 ファイル名：list 01
リストを切り出す　（スライス）
'''


lst = [10, 3.14, 'abc']
slice = lst[1:3]
print(slice)
# 省略できる (can be omitted)　Pー８８
slice = lst[:2] #開始を省略する０から
print(slice)
slice = lst[1:] #終了省略すると最後まで
print(slice)
