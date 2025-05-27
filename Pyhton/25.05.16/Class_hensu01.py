from productmethod import create_product
from productclass import Product

print("商品登録を開始します。")
while True:
    data = create_product()
    if data is None:
        break

    code, price, quantity = data
    p = Product(code, price, quantity)
    p.set_category()
    p.calc_amount()
    Product.product_list.append(p)

print("\n商品情報一覧")
for p in Product.product_list:
    p.show_info()

Product.show_total_evaluation()
Product.show_top_and_bottom()
