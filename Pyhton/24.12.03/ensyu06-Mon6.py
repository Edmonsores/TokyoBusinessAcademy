
n = int(input("表示する記号の個数を入力してください: "))
w = int(input("改行する個数を入力してください: "))

for i in range(1, n + 1):
    print("＊", end="") 
    if i % w == 0:
        print()

if n % w != 0:
    print()
