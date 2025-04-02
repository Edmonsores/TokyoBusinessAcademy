
def get_store_name(store_id):
    jisyo = {102: '渋谷', 105: '新宿', 112: '原宿', 230: '池袋', 212: '東京'}
    return jisyo.get(store_id, None)


def evaluate_sales(store_name, sales):
    tenmei = {'渋谷': 250000, '新宿': 630000, '原宿': 456000, '池袋': 358000, '東京': 850000}
    
    target = tenmei.get(store_name)
    if target is None:
        return None

    if sales >= target:
        return "達成"
    else:
        percentage = (sales / target) * 100
        return f"目標の{percentage:.2f}%"


def main():
    while True:
        try:
            store_id = int(input("店のIDを入力してください (終了するには999を入力): "))
            if store_id == 999:
                print("プログラムを終了します。")
                break

            sales = int(input("売上金額を入力してください: "))
        except ValueError:
            print("正しい数値を入力してください。")
            continue
 
        store_name = get_store_name(store_id)
        if store_name is None:
            print(f"ID={store_id}は無効なIDです。")
            continue

        evaluation = evaluate_sales(store_name, sales)
        if evaluation is None:
            print(f"店名={store_name}のデータが見つかりません。")
            continue

        print(f"ID={store_id}：店名={store_name}は、{evaluation}です。")

main()
