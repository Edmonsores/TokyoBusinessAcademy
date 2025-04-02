'''
Chapter 4
P-72 ファイル名: list4_04
if - elif - else
'''
str1 = input('「abc」「123」「ABC」のいずれかを入力ください⇒')
if str1 == 'abc':
   print('abcと入力されました')
elif str1 == '123' :
    print('123と入力されました')
elif str1 == 'ABC' :
    print('ABCと入力されました')
else:
    print('入力間違いがありました')
print('終了します')
