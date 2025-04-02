def calculate_points(birth_month, age):


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
    birth_month = int(input("誕生月を入力してください(1-12): "))
    age = int(input("年齢を入力してください: "))

    result = calculate_points(birth_month, age)
    print(result)
main()
