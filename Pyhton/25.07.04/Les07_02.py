from ProductShop import ProductShops
def main():
    shops = []

    for i in range(3):
        print(f"---- {i + 1} 店舗目 ----")
        shop_id = int(input("売り場IDを入力: "))
        shop_name = input("売り場名称を入力: ")
        target_amount = int(input("目標額を入力: "))
        unit_price = int(input("商品単価を入力: "))
        number_of_customers = int(input("来客数を入力: "))

        shop = ProductShops(shop_id, shop_name, target_amount, unit_price, number_of_customers)
        shop.calculate_sales()
        shops.append(shop)

    print("\n---- 売上結果一覧 ----")
    for shop in shops:
        shop.print_result()

main()
