def calculate_points(birth_month, age):
    """
    Calculate points based on birth month and age.
    """
    if age >= 90:
        return "Dコース20ポイント"
    elif birth_month == 12:
        return "Cコース10ポイント"
    elif age >= 60 and birth_month == 2:
        return "Bコース5ポイント"
    elif age >= 20 and birth_month == 8:
        return "Aコース3ポイント"
    else:
        return "ポイント無"

def main():
    """
    Main function to input data for 8 people, calculate their points, and count the results.
    """
    point_counts = {
        "Dコース20ポイント": 0,
        "Cコース10ポイント": 0,
        "Bコース5ポイント": 0,
        "Aコース3ポイント": 0,
        "ポイント無": 0
    }

    print("8名のデータを入力してください。")
    for i in range(8):
        print(f"\n{i + 1}人目:")
        while True:
            try:
                birth_month = int(input("誕生月を入力してください(1-12): "))
                if birth_month < 1 or birth_month > 12:
                    print("1から12の範囲で入力してください。")
                    continue
                break
            except ValueError:
                print("無効な入力です。有効な数値を入力してください。")

        while True:
            try:
                age = int(input("年齢を入力してください: "))
                if age < 0:
                    print("年齢は正の数で入力してください。")
                    continue
                break
            except ValueError:
                print("無効な入力です。有効な数値を入力してください。")

        result = calculate_points(birth_month, age)
        print(f"結果: {result}")
        point_counts[result] += 1

    print("\nポイントの集計結果:")
    for point_type, count in point_counts.items():
        print(f"{point_type}: {count}件")

main()
