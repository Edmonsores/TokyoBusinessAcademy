'''
P-90 ファイル名：list 06
'''

lst = [10, 3.14, 'abc']

print(lst[1]) #変更前
lst[1] =6.2
print(lst[1]) #変更後
print(lst)

# add value to the list

# += p-91　演算子でリストにつなげる
lst += [20]
print(lst)

# append p-91　メソッドによる追加
lst.append(5.5)
print(lst)

# insert p-91　メソッドを使い途中に追加
lst.insert(1, 'ABC')
print(lst)
