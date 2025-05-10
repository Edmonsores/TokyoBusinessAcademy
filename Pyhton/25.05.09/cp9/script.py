'''
Main
'''
import my_func
import my_class

result1 = my_func.plus(10, 3)
result2 = my_func.minus(10, 3)

print('10 + 3 =', result1)
print('10 - 3 =', result2)

account1 = my_class.Account('佐藤', 1, 1000)
account1.show_detail()
