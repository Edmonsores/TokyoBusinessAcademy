#p-226 List13-6 - try... except

try:
    a=int(input('整数を入力してくださいー＞'))
    result = 100/a
except ValueError:
    print('整数を入力しないといけません')
except ZeroDivisionError:
    print('0で割り算してはいけません')
else:
    print(result)