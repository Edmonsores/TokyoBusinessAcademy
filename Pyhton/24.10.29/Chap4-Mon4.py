'''
Chap4-Mon4
'''
age = int(input('年齢を入力ください⇒'))
gender =int(input('性別を入力ください(男子＝１、女子＝２)⇒'))
if gender == 1:
   gender1 = '男'
elif gender == 2:
   gender1 = '女'
else:
   gender1 = 'エラー'
if  0 <= age <= 12:
   fee = '500円'
elif 13 <= age <= 20:
   fee = '1000円'
elif age <=21 and gender == 1:
   fee = '2000円'
elif age <=21 and gender == 2:
   fee = '1500円'
else:
    print('性別の入力エラー')
    fee = 'エラー'
print('性別:',gender1,'年齢:',age,'料金:',fee)

