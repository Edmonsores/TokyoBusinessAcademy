# kan-mon3

# 最大値と最小値を求める関数
def find_max_min(TBL):
    max_value = max(TBL)  # 最大値を求める
    min_value = min(TBL)  # 最小値を求める
    return max_value, min_value  # 最大値と最小値をタプルとして返す

# 主な処理を行う関数
def main():
    # TBLを定義
    TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]
    
    # 関数を呼び出し、最大値と最小値を取得
    max_value, min_value = find_max_min(TBL)
    
    # 結果を表示
    print(f"最大値: {max_value}")
    print(f"最小値: {min_value}")

# main関数を呼び出して実行
main()
