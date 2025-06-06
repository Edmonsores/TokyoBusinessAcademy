'''
p-182 乱数を作る
random
List10-13
'''

import random
rd=random.random()
print(rd)

#List10-14

dice=random.randint(1, 6)
print('サイコロの目は', dice, 'です')

#p-183 List10-15

lst =[10, 3.14, 'abc,(5, 10, 15)']
el = random.choice(lst)
print(el)