
def generate_multiple_list(start, end, step):
    result = []
    for value in range(start, end + 1, step): #range finishes 1 number before so +1
        # 倍数値である場合のみ追加
        if value % step == 0:  
            result.append(value)
    return result


def main():

    print("初期値、終了値、増分値を入力してください。")
    start = int(input("初期値: "))
    end = int(input("終了値: "))
    step = int(input("増分値: "))
    
    multiples_list = generate_multiple_list(start, end, step)
    
    print("生成されたリスト:", multiples_list)


main()
