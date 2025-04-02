n = int(input("1以上の数を入力してください: "))

total_sum = 0
multiples_of_4 = []


for i in range(1, n + 1):
    if i % 4 == 0:
        multiples_of_4.append(i)
        total_sum += i

print(f"1から{n}までの4の倍数は: {multiples_of_4}")
print(f"4の倍数の総和は: {total_sum}")
