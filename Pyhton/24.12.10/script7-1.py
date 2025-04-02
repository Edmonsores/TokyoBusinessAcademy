# P-145 Script 7-1
def print_score(x, y, z):
    sum = x+y+z
    avr = sum/3

    print("合計値：", sum)
    print("平均値：", avr)

x = int(input("整数1を入力してくださいー＞"))
y = int(input("整数２を入力してくださいー＞"))
z = int(input("整数３を入力してくださいー＞"))

print_score(x,y,z)
