def searchfun(kye):
    List1=[20,60,50,10,70,30,90,100,85,65]
    on=2
    for x in List1:
        if x==kye:
            on=1
            break
    return on
in_kye=int(input("検索するキー=>"))
sw=searchfun(in_kye)
if sw==1:
    print("検索値は見つかりました")
else:
    print("検索値はList1の中にはありません")
