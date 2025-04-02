def calculate_sum_and_average(tbl):
    total = sum(tbl)
    average = total / len(tbl)
    return total, average

def find_max_and_min(tbl):
    max_value = tbl[0]
    min_value = tbl[0]

    for num in tbl:
        if num > max_value:
            max_value = num
        if num < min_value:
            min_value = num

    return max_value, min_value

def main():
    TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]

    total, average = calculate_sum_and_average(TBL)
    print(f"合計: {total}, 平均: {average:.2f}")

    max_value, min_value = find_max_and_min(TBL)
    print(f"最大値: {max_value}, 最小値: {min_value}")
main()
