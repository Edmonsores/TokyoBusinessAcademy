# P-146 Script 7-3

def get_total(x, y, z):
    return x+y+z

def get_avarage(x, y, z):
    return (x+y+z)/3

def get_student(name): 
         students = {'佐藤':{'math':64,'english':98,'japanese':79},
                    '丸山':{'math':48,'english':87,'japanese':92},
                    '三村':{'math':100,'english':40,'japanese':65},
                    '古川':{'math':83,'english':81,'japanese':74}}
         if name in students:
             return students[name]
         else:
             return {'math':0,'english':0,'japanese':0}


in_name = input("生徒名を入力してくださいー＞")
student = get_student(in_name)

total = get_total(student['math'], student['english'], student['japanese'])
average = get_avarage(student['math'], student['english'], student['japanese'])

print("合計値：", total)
print("平均値：", average)
