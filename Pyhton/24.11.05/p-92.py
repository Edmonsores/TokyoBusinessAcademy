'''
P-90 ファイル名：list 07
'''

lst = [10, 3.14, 'abc']

del lst[1]
print(lst)

# popをメソッドを使用（インデックスを指定）
lst2=[20, 6.3, 85, 'ABC']
lst2.pop(2)
print(lst2)

# removeメソッドを使用（要素を指定）
lst2.remove(6.3)
print(lst2)
