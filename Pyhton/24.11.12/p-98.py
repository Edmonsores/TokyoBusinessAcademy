'''
P-98 ファイル名：tuple05
'''

tpl = (10, 3.14, 'abc')
count = len(tpl) #contar o numero de elementos
print(count)
print(3.14 in tpl) #verificar se o elemento ha na tupla


'''
P-98 ファイル名：tuple06
'''
tpl = (10, 3.14, 'abc')
lst = list(tpl)
print(lst)

tpl = tuple(lst)
print(tpl)
