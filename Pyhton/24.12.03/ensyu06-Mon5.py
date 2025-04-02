n = int(input("表示する個数を入力してください: "))


result = ""
for i in range(n):
    if i % 2 == 0:  
        result += "＋"
    else: 
        result += "－"

print(result)
