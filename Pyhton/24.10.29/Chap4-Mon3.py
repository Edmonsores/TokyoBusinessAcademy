'''
Chap4-Mon3
'''
name = input('名前を入力ください⇒')
age = int(input('年齢を入力ください⇒'))

if 0 <= age <= 5:
   class_name = '幼児クラス'
elif 6 <= age <= 7:
   class_name = '小学クラス'
elif 8 <= age <= 12:
   class_name = '高学年クラス'
else:
    print('入力エラー')
    class_name = 'エラー'
print('名前:',name,'年齢:',age,'クラス:',class_name)

