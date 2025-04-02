
def bubble_sort_descending(data):
    n = len(data)
    for i in range(n):
        for j in range(0, n - i - 1):
            if data[j] < data[j + 1]:
                # 数字を入れ替える (Swap the numeros)
                data[j], data[j + 1] = data[j + 1], data[j]

def main():
    data = [] 
    while True:
        user_input = input("数字を入力してください（終了するには '終了' と入力）: ")
        if user_input == '終了':  # 終了コマンドを確認
            break
        try:
            # 入力を整数に変換する (Convert the input to an integer)
            number = int(user_input)
            data.append(number)  # 数字をリストに追加 (Add a number to a list)
        except ValueError:
            print("有効な数字を入力するか、'終了' と入力してください。")

    print("入力されたリスト:", data)

    # 降順に並べ替え (バブルソート) (Sort in descending order (bubble sort))
    bubble_sort_descending(data)

    # 結果を表示
    print("降順に並べ替えたリスト:", data)

main()
