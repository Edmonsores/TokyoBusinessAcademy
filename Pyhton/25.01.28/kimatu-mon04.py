
def get_scores():
    """
    ユーザーから人数とゲームの点数を入力し、リストを返します。
    The user inputs the number of players and the game score, and returns a list.
    """
    num_people = int(input("人数を入力してください: "))  # 人数を入力 (Enter the number of people)
    scores = []  # 点数を格納するリスト (A list to store the scores)
    for i in range(num_people):
        score = int(input(f"{i+1}番目の人の点数を入力してください: "))
        scores.append(score)  # リストに追加 (Add to list)
    return scores


def main():
    # 点数のリストを作成する関数を呼び出す (Call a function to create a list of scores)
    scores = get_scores()
    
    # 合計と平均を計算する (Calculate sums and averages)
    total = sum(scores)  # 合計
    average = total / len(scores)  # 平均
    
    print(f"合計: {total}, 平均: {average}")
    
    # 平均より大きい値を検索し表示する(Search and display values ​​greater than the average)
    print("平均より大きい点数:")
    for score in scores:
        if score > average:
            print(score)

main()
