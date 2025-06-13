#p-227 List13-7 - try... except

try:
    a=int(input('整数を入力してくださいー＞'))
    result=100/a
except (ValueError, ZeroDivisionError):
    print('入力値に誤りがありません')
else:
    print(result)