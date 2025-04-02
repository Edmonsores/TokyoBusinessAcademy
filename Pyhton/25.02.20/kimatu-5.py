def jisyosearch(kye):
    jisyo = {'AA': 100, 'BB': 250, 'CC': 300, 'DD': 450, 'EE': 350, 'FF': 750}
    atai = jisyo.get(kye)
    if atai==None:
        return False, 0
    else:
        return True, atai

go=0
while True:
    in_kye = input("大文字の英字＝＞")
    sw,val=jisyosearch(in_kye)
    if sw == False:
        print("プログラム終了")
        break
    else:
        print(in_kye,"キーの値：",val)
        go += val
print("キーの値の合計：",go) 
