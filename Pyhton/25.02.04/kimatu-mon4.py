"""
キーボードから人数とゲームの点数を入力し、リストを作成する関数
A fnction that creates a list by inputting the number of players and the game score from the keyboard.
""" 
def input_process():
    
    num_players = int(input("人数を入力してください: "))
    scores = []
    for i in range(num_players):
        score = int(input(f"{i+1}人目の点数を入力してください: "))
        scores.append(score)
    return scores



"""
リストから合計と平均を計算する関数
Funtions to Calculate Sum and Average from Lists
"""
def sum_average(scores):

    total = sum(scores)
    average = total / len(scores)
    return total, average


    
"""
平均値より大きい値の数を求める関数
A function to find the number of values ​​greater than the average
"""
def above_average(scores, average):

    count = 0
    above_average = []
    for score in scores:
        if score > average:
            count += 1
            above_average.append(score)       
    return count, above_average


# Main process
scores = input_process()
total, average = sum_average(scores)
count = above_average(scores, average)


print("ゲームの点数リスト:", scores)
print("合計点:", total)
print("平均点:", average)
print(f"平均点より大きい値の数: {count}")

