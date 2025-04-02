'''
Chapter 4
P-79 ファイル名: list4_016
if - if - if
'''

str1 = input('「abc」と入力ください⇒')
#ブロック1
if str1 == 'abc':
   print('abcが正しく入力されました')
   str2 = input('123と入力されました')
   #ブロック2
   if str2 == '123' :
      print('123が正しく入力されました')
      print('ifブロック2が終わります')
   print('ifブロック1が終わります')
#ブロックラムブロック終了
print('終了します')
