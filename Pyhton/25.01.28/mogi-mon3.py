def main():
    # List1をユーザー入力で作成
    List1 = []
    num_elements = int(input("List1の要素数を入力してください: "))  # List1の長さを指定(Specify the length of List1)
    for i in range(num_elements):
        value = int(input(f"List1の{i+1}番目の値を入力してください: "))
        List1.append(value)
    
    # 定義されたTBL
    TBL = [15, 23, 58, 64, 10, 45, 35, 15, 10, 64]
    
    # List1とTBLを一つに結合してTBL2に代入 (Combine ist1 and TBL into one and assign to TBL2)
    TBL2 = List1 + TBL
    
    # セット関数を使って重複する値を削除 (Use a set function to remove duplicate values)
    TBL2 = list(set(TBL2))
    
    # TBL2を表示
    print("TBL2:", TBL2)


main()
