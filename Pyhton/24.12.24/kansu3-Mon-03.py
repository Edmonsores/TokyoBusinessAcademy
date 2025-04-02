
lst = []  
count_multiples_of_3 = 0 


def process_multiple_of_3(value):
    global lst, count_multiples_of_3

    if value % 3 == 0:
        lst.append(value)
        count_multiples_of_3 += 1

    print(f"現在の3の倍数リスト: {lst}")
    print(f"3の倍数のカウント: {count_multiples_of_3}")


def main():
    while True:
        try:

            number = int(input("整数値を入力してください (終了値: 999): "))

            if number == 999:
                print("入力を終了します。")
                break
            
            process_multiple_of_3(number)
        except ValueError:
            print("正しい整数値を入力してください。")

    print("最終的な3の倍数リスト:", lst)
    print("3の倍数の最終カウント:", count_multiples_of_3)

main()
