'''
P-111 ファイル名：script5-6
'''
students = {
          '佐藤':{'math':64,'english':98,'japaness':79},
          '丸山':{'math':48,'english':87,'japaness':92},
          '三村':{'math':100,'english':40,'japaness':65},
          '古川':{'math':83,'english':81,'japaness':74}
          }
name=input("生徒の名前を入力してください→")
if name in students:
 print(students[name])
else:
    print("存在しません")

