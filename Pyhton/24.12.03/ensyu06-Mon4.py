x = int(input("xを入力してください: "))
y = int(input("yを入力してください: "))
    
if x > y:
        print("入力エラー")
else:
    numbers = list(range(x, y + 1))
    process = ""
    for i in numbers:
        if i == numbers[-1]:
            process += str(i)
        else:
            process += str(i) + "+"

    total = sum(numbers)
    print(f"{process} = {total}")
