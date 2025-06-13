#p-223 List13-2 - try... except

try:
    a=int(input('整数を入力してくださいー＞'))
    if a < 0 or a >= 10:
        print('aは0より小さい、または10以上です')
    else:
        print('aは0以上10未満です')
except:
    print('整数を入力しないといけません')
