#ファイル名：chap10-random

import random
omikuji= ['大吉 ','中吉 ','小吉 ', '凶 ','大凶 ' ]
omi = input("おみくじを引きますか？ YES=1, NO=2：")

if omi == '1':
    print(" おみくじ3回勝負：")
    for i in range(1, 4):
        r = random.choice(omikuji)
        print(i,"回目の結果:",r)
else:
    print("おみくじは引きませんでした。")