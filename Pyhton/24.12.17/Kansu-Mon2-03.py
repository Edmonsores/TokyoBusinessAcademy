
def calculate_admission_fee(age):
#calcular a entrada pela idades
    if age >= 60:
        return 300 
    elif 20 <= age < 60:
        return 1000
    elif 5 <= age < 20:
        return 500 
    else:
        return 0 


def main():
    # Solicita as idades das 5 pessoas
    print("各人の年齢を入力してください。")
    ages = []
    for person in ["A", "B", "C", "D", "E"]:
        age = int(input(f"{person}さんの年齢: "))
        #insere as idades em ages
        ages.append(age)
    
    total_fee = 0
    for age in ages:
        total_fee += calculate_admission_fee(age)
    

    print("5人分の入園料の合計:", total_fee)


main()
