def sortfun(lists, sw):
    if sw == 1:
        x = len(lists) 
        while x > 0: 
            i = 0
            while i< x-1:
                if lists[i] < lists[i+1]: 
                    work = lists[i]
                    lists[i] = lists[i+1]
                    lists[i+1] = work
                i += 1
            x -= 1
    else: 
        for i in range(len(lists)):
            for j in range(i+1, len(lists)):
                if lists[i] > lists[j]:
                    work = lists[i]
                    lists[i] = lists[j]
                    lists[j] = work


TBL = [20,60,50,10,70,30,90,100,85,65] 
ff = int(input("昇順＝１、降順＝2  ＝＞"))
sortfun(TBL, ff)
print("TBL = ", end="")
print(TBL)
