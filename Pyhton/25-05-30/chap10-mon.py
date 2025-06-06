#ファイル名：chap10-mon - Birthday

from datetime import date
weekday_jp = ["月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"]

birthday = date(2025, 3, 18)
b = birthday - date.today()

print("今年の誕生日から今日まで：", b.days, "日")
print("今年の誕生日の曜日：", weekday_jp[birthday.weekday()])
