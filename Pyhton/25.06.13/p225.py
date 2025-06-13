#p-225 List13-4 - try... except

try:
    a=int(input('整数を入力してくださいー＞'))
except:
    print('整数を入力しないといけません')
else:
    if a < 0 or a >= 10:
        print('aは0より小さい、または10以上です')
    else:
        print('aは0以上10未満です')