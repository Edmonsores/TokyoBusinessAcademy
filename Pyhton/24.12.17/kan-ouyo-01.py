
def display_result(sw, kazu):

    if sw == 1:
        print(f"計算結果は、{kazu}です。") 
    else:
        print("1万円未満でした。")


def main():
    # 単価と数量を入力
    unit_price = float(input("商品の単価を入力してください（円）: "))
    quantity = int(input("商品の数量を入力してください: "))
    
    # 金額を計算
    total_price = unit_price * quantity
    
    # 金額が1万円以上の場合、関数を呼び出して表示
    if total_price >= 10000:
        display_result(1, total_price)  
    else:
        display_result(0, total_price)

main()
