def evaluate_scores(score1=0, score2=0):

    total = score1 + score2
    

    if score1 >= 60 and score2 >= 60:
        evaluation = "合格"
    elif score1 >= 60 or score2 >= 60:
        evaluation = "もう少し頑張りましょう"
    else:
        evaluation = "不合格"

    return total, evaluation


def main():

    name = input("名前を入力してください: ")
    score1 = int(input("テストの点数1を入力してください: "))
    score2 = int(input("テストの点数2を入力してください: "))


    total, evaluation = evaluate_scores(score1, score2)


    print(f"{name}さんは、合計点が{total}点です。評価は{evaluation}です。")
    
main()
