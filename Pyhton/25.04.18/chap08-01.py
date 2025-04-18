'''
ファイル名：chap08-01
'''

class Store:
    def __init__ (self, in_number=0, in_name='', in_sales=0):
        self.number = in_number
        self.name = in_name
        self.sales = in_sales

    def show_detail(self):
        print('店番:',self.number)
        print('店名:',self.name)
        print('売上額:',self.sales)

    def total_sales(self):
        if(self.sales <=1000):
            return "低迷"
        elif(self.sales <=5000):
            return "現状維持"
        else:
            return "好調"

shop1=Store(101, '渋谷', 600)
shop2=Store(102, '新宿', 3500)
shop3=Store(103, '上野', 7000)

shop1.show_detail()
shopsale1 = shop1.total_sales()
print('売上の判定', shopsale1)

print()

shop2.show_detail()
shopsale2 = shop2.total_sales()
print('売上の判定', shopsale2)

print()

shop3.show_detail()
shopsale3 = shop3.total_sales()
print('売上の判定', shopsale3)
