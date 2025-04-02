# kan-mon4

def calculate_sums(array):

    even_sum = 0  # 偶数番地の合計
    odd_sum = 0   # 奇数番地の合計

    for i in range(len(array)):
        if i % 2 == 0:
            even_sum += array[i]
        else:
            odd_sum += array[i]
    return even_sum, odd_sum

# 配列 TBL の定義
TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]

# 関数を呼び出して合計値を取得
even_sum, odd_sum = calculate_sums(TBL)

print(f"偶数番地の合計: {even_sum}")
print(f"奇数番地の合計: {odd_sum}")
