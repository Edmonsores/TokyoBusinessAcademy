
def calculate_sum_and_average(scores):
    total = sum(scores)
    average = total / len(scores)
    return total, average

def find_max_and_min(scores):
    max_score = scores[0]
    min_score = scores[0]

    for score in scores:
        if score > max_score:
            max_score = score
        if score < min_score:
            min_score = score

    return max_score, min_score


def main():
    try:
        num_people = int(input("人数を入力してください: "))
        if num_people <= 0:
            print("人数は1以上を入力してください。")
        else:
            scores = []
            for i in range(num_people):
                score = int(input(f"{i+1}人目のゲームの点数を入力してください: "))
                scores.append(score)

            total, average = calculate_sum_and_average(scores)
            print(f"合計: {total}, 平均: {average:.2f}")

            max_score, min_score = find_max_and_min(scores)
            print(f"最高点: {max_score}, 最低点: {min_score}")
    except ValueError:
        print("正しい数値を入力してください。")
main()
