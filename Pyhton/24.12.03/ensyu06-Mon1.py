
n = int(input("20より大きい数を入力してください: "))


if n > 20:
    total_sum = 0
    for i in range(20, n + 1):
        total_sum += i

    print(f"20から{n}までの総和は: {total_sum}")
else:
    print("20より大きい数を入力してください。")
