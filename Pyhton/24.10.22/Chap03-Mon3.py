name = input("名前を入力してください: ")
year = input("生年を入力してください: ")
month = input("生月を入力してください: ")
day = input("生日を入力してください: ")

birthyear = int(year)

currentyear = 2024
currentmonth = 10
currentday = 22

age = (currentyear-birthyear)

print('私は'+name+'です。現在'+str(age)+'才です。')
print('誕生月は'+str(month)+'月です。')
