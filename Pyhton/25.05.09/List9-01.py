'''
P-163 - List 9-1
'''
def plus(x=0, y=0):
    return x+y

def minus(x=0, y=0):
    return x-y

class Account:
    def __init__(self, name, no, balance):
        self.__name = name
        self.__no = no
        self.__balance = balance

    def show_detail(self):
        print('口座名義', self.__name)
        print('口座番号', self.__no)
        print('残高', self.__balance)

result1 = plus(10, 3)
result2 = minus(10, 3)

print('10 + 3 =', result1)
print('10 - 3 =', result2)

account1 = Account('佐藤', 1, 1000)
account1.show_detail()
