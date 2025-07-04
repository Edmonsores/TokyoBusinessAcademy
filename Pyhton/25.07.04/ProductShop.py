#SubClass
from Shop import BaseShop
class ProductShops(BaseShop):
    def __init__(self, shop_id, shop_name, target_amount, unit_price, number_of_customers):
        super().__init__(shop_id, shop_name, target_amount)
        self.unit_price = unit_price
        self.number_of_customers = number_of_customers
        self.sales_amount = 0

    def calculate_sales(self):
        self.sales_amount = self.unit_price * self.number_of_customers

    def judge_achievement(self):
        if self.sales_amount >= self.target_amount:
            return "目標達成"
        else:
            return "目標額に届かない"

    def print_result(self):
        self.print_info()
        print(f"商品単価: {self.unit_price}")
        print(f"来客数: {self.number_of_customers}")
        print(f"売上金額: {self.sales_amount}")
        print(f"判定: {self.judge_achievement()}")
        print("------------------------------------------")
