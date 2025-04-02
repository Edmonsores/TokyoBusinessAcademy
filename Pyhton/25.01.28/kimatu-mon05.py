# 関数処理内容
def search_key(key):
    """
    キーが辞書にあるかを確認し、あればTrueとその値を返し、無ければFalseと0を返す
    Checks if the key is in the dictionary and returns True and its value if it is, otherwise returns False and 0.
    """
    # 定義された辞書(Defined dictionaries)
    jisyo = {'AA': 100, 'BB': 250, 'CC': 300, 'DD': 450, 'EE': 350, 'FF': 750}
    
    # キーが辞書にあれば、その値を返す
    if key in jisyo:
        return True, jisyo[key]
    else:
        return False, 0


def main():
    total = 0  # 合計値を初期化 (Initialize the total value)
    
    while True:
        key = input("キーを入力してください（終了するには '終了' と入力）: ")
        
        if key == "終了":
            # "終了" が入力されたら合計を表示して終了 (When "End" is entered, display the total and exit)
            print("合計値:", total)
            break
        
        # 関数を呼び出し、戻り値を判定 (Call a function and check the return value)
        found, value = search_key(key)
        
        if found:
            # キーが見つかった場合、その値を合計に加える(# If the key is found, add its value to the sum)
            total += value
        else:
            # キーが見つからなかった場合、合計を表示して終了 (If key not found, print total and exit)
            print("キーが見つかりませんでした。合計値:", total)
            break

main()
