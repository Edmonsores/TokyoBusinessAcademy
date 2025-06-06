#P-175 List-05
from datetime import date
t = date.today()
print(t)

#P-176 List10-07
if date.today() < date(2000,5,30):
    print("過去の日付です")
elif date.today() == date(2025,5,30):
    print("今日です")
else:
    print("未来の日付です")