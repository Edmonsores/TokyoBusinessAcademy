class Product:
    total_sales = 0  # クラス変数：全体売上
    product_list = []  # クラス変数：商品リスト

    def __init__(self, code, price, quantity):
        self.code = code
        self.price = price
        self.quantity = quantity
        self.category = ''
        self.amount = 0

    def set_category(self):
        if 1000 <= self.code < 2000:
            self.category = 'アウター'
        elif 2000 <= self.code < 3000:
            self.category = 'インナー'
        elif 3000 <= self.code < 4000:
            self.category = 'ワンピース'
        elif 4000 <= self.code < 5000:
            self.category = 'パンツ'

    def is_valid_code(self):
        return 1000 <= self.code <= 4999

    def calc_amount(self):
        self.amount = self.price * self.quantity
        Product.total_sales += self.amount

    def show_info(self):
        print('商品番号:', self.code)
        print('分類名:', self.category)
        print('単価:', self.price, '円')
        print('売上個数:', self.quantity, '個')
        print('売上金額:', self.amount, '円')
        print('-----------------------')

    @classmethod
    def show_total_evaluation(cls):
        print('\n総売上金額:', cls.total_sales, '円')
        if cls.total_sales >= 1_000_000:
            print("評価：売上好調")
        elif cls.total_sales >= 500_000:
            print("評価：売上半減")
        else:
            print("評価：売上赤字")

    @classmethod
    def show_top_and_bottom(cls):
        if not cls.product_list:
            print("登録された商品がありません")
            return

        top = cls.product_list[0]
        bottom = cls.product_list[0]

        for product in cls.product_list[1:]:
            if product.amount > top.amount:
                top = product
            if product.amount < bottom.amount:
                bottom = product

        print('\n売上金額が最も高い商品：')
        top.show_info()

        print('売上金額が最も低い商品：')
        bottom.show_info()
