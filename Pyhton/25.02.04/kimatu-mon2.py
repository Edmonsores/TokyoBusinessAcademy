def search(search_value):
    List1 = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]
    for num in List1:
        if num == search_value:
            return 1  # Found 見つかった
    return 2  # Not found 見つからなかった

# Main process
search_value = int(input("検索値を入力してください: "))
result = search(search_value)

if result == 1:
    print("検索値は見つかりました")
else:
    print("検索値はList1の中にはありません")
