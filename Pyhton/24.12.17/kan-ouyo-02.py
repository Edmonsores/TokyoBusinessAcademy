
def search_key(key):

    TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]
    
    if key in TBL:
        # 見つかった場合
        return 1, TBL.index(key)
    else:
        # 見つからない場合
        return 2, 99


def main():

    key = int(input("検索するキーの値を入力してください: "))
    

    result, index = search_key(key)
    
    if result == 1:
        print(f"{index}番地に見つかりました。")  # 番地が99でない場合
    else:
        print("TBLに見つかりませんでした。")  # 番地が99の場合

main()
