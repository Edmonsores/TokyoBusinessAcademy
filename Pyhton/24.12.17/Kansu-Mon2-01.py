
def calculate_sum_and_average(score1, score2, score3, score4):

    total = score1 + score2 + score3 + score4
    average = total / 4

    return total, average


def main():
    print("4教科の点数を入力してください。")
    score1 = int(input("科目1の点数: "))
    score2 = int(input("科目2の点数: "))
    score3 = int(input("科目3の点数: "))
    score4 = int(input("科目4の点数: "))
    
    total, average = calculate_sum_and_average(score1, score2, score3, score4)
    
    print("合計点:", total)
    print("平均点:", average)


main()

