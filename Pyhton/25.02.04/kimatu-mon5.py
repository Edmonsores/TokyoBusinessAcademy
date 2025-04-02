"""
辞書を検索し、キーが存在する場合は True とその値を、存在しない場合は False と 0 を返す関数
A function that searches a dictionary and returns True and its value if the key exists, or False and 0 if it does not exist.
"""
def search_key(key):
 
    jisyo = {'AA': 100, 'BB': 250, 'CC': 300, 'DD': 450, 'EE': 350, 'FF': 750}
    if key in jisyo:
        return True, jisyo[key]
    else:
        return False, 0

# Main process
total = 0
while True:
    key = input("キーを入力してください（終了するには存在しないキーを入力）: ")
    found, value = search_key(key)
    if found:
        total += value
        print(f"キー '{key}' は見つかりました。値: {value}, 合計: {total}")
    else:
        print("プログラム終了")
        break  # False が返されたらループを終了 (If False is returned, exit the loop)
