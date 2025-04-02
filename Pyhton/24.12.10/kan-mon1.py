# kan-mon1
def display_message(count):
    for i in range(1, count + 1):
        print(f"Pythonの授業は{i}回目です")

count = int(input("表示したい回数を入力してください: "))

if count <=100:
    display_message(count)
else:
    print("無効な入力です。整数を入力してください。")

