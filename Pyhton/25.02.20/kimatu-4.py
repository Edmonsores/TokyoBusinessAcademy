def inputfun():
    listin = []
    kazu = int(input('人数＝＞'))
    for i in range(kazu):
        print ((i+1),'人目')
        ten=int(input('ゲームの点数＝＞'))
        listin+=[ten]
    return listin

def sumavrfun(listin):
    go=0
    for val in listin:
        go+=val
    avr=go/len(listin)
    return go, avr

def countfun(listin, in_avr):
    count=0
    for val in listin:
        if in_avr < val:
            count+= 1
    return count

listin=[]
listin = inputfun()
print(listin)
m_go, m_avr = sumavrfun(listin)
print('合計値：',m_go,'平均値：',m_avr)
m_count=countfun(listin, m_avr)
print('平均値より大きい数：', m_count)
