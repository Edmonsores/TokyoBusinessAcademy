def listfun(end):
    goukei=0
    for val in range(10,end+1,2):
        goukei +=val
    return goukei

in_end=int(input("リストの終了値=>"))
go=listfun(in_end)
print("合計値:", go)
