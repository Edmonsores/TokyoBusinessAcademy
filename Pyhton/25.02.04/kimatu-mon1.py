def sum(end_value):
    total = 0
    for i in range(10, end_value, 2):
        total += i
    return total

# Main process
end_value = int(input("終了値を入力してください: "))
result = sum(end_value)
print(f"合計値: {result}")
