List1 = [10, 25, 50, 65, 77, 85, 100, 105, 110, 130, 155, 160]

def binary_search(data, key):
    low = 0
    high = len(data) - 1
    
    while low <= high:
        mid = (low + high) // 2  # Índice do meio (中央のインデックス)
        if data[mid] == key:
            return mid  # Encontrou o valor, retorna o índice (値が見つかった場合、インデックスを返す)
        elif data[mid] < key:
            low = mid + 1  # Procurar à direita (中央より右側を探索)
        else:
            high = mid - 1  # Procurar à esquerda (中央より左側を探)
    
    return -1  # Se não encontrar o valor (値が見つからなかった場合、-1を返す)

def main():
    key = int(input("検索するキーを入力してください: "))

    # Realiza a busca binária (バイナリサーチを実行)
    result = binary_search(List1, key)
    
    if result != -1:
        print(f"キーの値 {key} はインデックス {result} に見つかりました。")
    else:
        print("キーと同じ値は有りませんでした。")

main()
