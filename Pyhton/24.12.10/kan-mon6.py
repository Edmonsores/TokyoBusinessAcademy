# kan-mon6

def create_multiples_list(multiplier):

    multiples = [] 
    i = 1 

    while i * multiplier <= 50: 
        multiples.append(i * multiplier)  # リストに倍数値を追加
        i += 1  # カウンタをインクリメント

    return multiples 



multiplier = int(input("倍数値を入力してください（1以上の整数）："))  # ユーザー入力を取得

if multiplier > 0:  # 倍数値が正の場合のみ処理を実行
    result_list = create_multiples_list(multiplier)  # 関数を呼び出してリストを取得
    print(f"1～50の間で {multiplier} の倍数のリスト: {result_list}") 
else:
    print("倍数値は1以上の整数を入力してください。") 
