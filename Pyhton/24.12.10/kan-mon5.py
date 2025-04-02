# kan-mon5

def get_value_from_dict(key):
    # 辞書の定義
    jisyo = {'AA': 100, 'BB': 250, 'CC': 300, 'DD': 450}

    if key in jisyo:
        return True, jisyo[key]
    else:
        return False, 0


# プログラムのメインロジック
total = 0  # 合計値の初期化

while True:
    key = input("キーを入力してください（終了するには 'exit' と入力）：")

    if key.lower() == 'exit':
        print(f"プログラムを終了します。最終的な合計値は {total} です。")
        break

    # 関数を呼び出して結果を取得
    found, value = get_value_from_dict(key)

    if found:
        print(f"キー '{key}' が見つかりました。値: {value}")
        total += value  # 合計値に追加
        print(f"現在の合計値: {total}")
    else:
        print(f"キー '{key}' は見つかりませんでした。最終的な合計値: {total}")
        break
