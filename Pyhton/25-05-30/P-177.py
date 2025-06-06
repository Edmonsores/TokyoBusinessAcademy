'''
p-177 日付や時間no表示
timedelta 
List10-08
'''
#ファイル名：list10-05

from datetime import date, datetime, timedelta
nd=date.today()-timedelta(days=1)
print(nd)
hd=datetime.now()+timedelta(hours=3)
print(hd)

td1=date(2000,3,10)-date(2000,3,3)
print(td1.days)
#2000/3/3 10:00から2000/3/3 10:30までの数秒
td2=datetime(2000,3,3,10,30)-datetime(2000,3,3,10,00)
print(td2.seconds)