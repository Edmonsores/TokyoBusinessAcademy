#p-179 
#ファイル名：list10-05

from datetime import date, datetime

s = '2000年3月3日'
dt = datetime.strptime(s, '%Y年%m月%d日')
print(dt)

dt = datetime(2000, 3, 3, 10, 30)
st = dt.strftime('%Y年%m月%d日%p%I%M')
print(st)