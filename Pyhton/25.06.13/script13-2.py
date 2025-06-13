#p-234

def get_total(x, y, z):
    return x + y + z

def get_average(x, y, z):
    return get_total(x, y, z) / 3

def check_number(num_str):
    try:
        return int(num_str)
    except:
        raise

num1 = 0
num2 = 0
num3 = 0

while True:
    try:
        num1 = check_number(input('整数1を入力してください->'))
    except:
        print('整数以外が入力されました')
    else:
        break

while True:
    try:
        num2 = check_number(input('整数2を入力してください->'))
    except:
        print('整数以外が入力されました')
    else:
        break

while True:
    try:
        num3 = check_number(input('整数3を入力してください->'))
    except:
        print('整数以外が入力されました')
    else:
        break

total = get_total(num1, num2, num3)
average = get_average(num1, num2, num3)
print('合計値:', total)
print('平均値:', average)