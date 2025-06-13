#p-228 List13-8 - try... except

try:
    a=int(input('整数を入力してくださいー＞'))
    result=100/a
except ValueError as ve:
    print('整数を入力しないといけません')
    print(ve)
except ZeroDivisionError as zde:
    print('0で割り算してはいけません')
    print(zde)
else:
    print(result)
finally:
    print('プログラムが終了しました')