# Super Class
class BaseShop:
    def __init__(self, shop_id, shop_name, target_amount):
        self.shop_id = shop_id
        self.shop_name = shop_name
        self.target_amount = target_amount

    def print_info(self):
        print(f"売り場ID: {self.shop_id}")
        print(f"売り場名称: {self.shop_name}")
        print(f"目標額: {self.target_amount}")
