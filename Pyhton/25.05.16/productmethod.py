from productclass import Product

def create_product():
    while True:
        try:
            code = int(input("商品番号を入力してください（終了は9999）："))
            if code == 9999:
                return None
            if not (1000 <= code <= 4999):
                print("エラー：商品番号は1000〜4999の範囲で入力してください。")
                continue
            price = int(input("単価を入力してください："))
            quantity = int(input("売上個数を入力してください："))

            return code, price, quantity

        except ValueError:
            print("エラー")

