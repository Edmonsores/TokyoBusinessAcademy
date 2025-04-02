# P-145 Script 7-2
def get_total(x, y, z):
    return x+y+z

def get_avarage(x, y, z):
    return (x+y+z)/3

x = int(input("整数1を入力してくださいー＞"))
y = int(input("整数２を入力してくださいー＞"))
z = int(input("整数３を入力してくださいー＞"))

total = get_total(x, y, z)
average = get_avarage(x, y, z)

print("合計値：", total)
print("平均値：", average)
