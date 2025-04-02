def register_student(student_data):


    class_input = input("クラスを入力してください (A, B, C): ")
    student_id = input("学籍番号を入力してください (1001-1100): ")
    name = input("氏名を入力してください: ")

    # 入力値の検証は問題1の関数validate_input()を利用
    if not validate_input(class_input, student_id):
        print("入力エラーです。もう一度入力してください。")
        return

    student_data[student_id] = {'class': class_input, 'name': name}
    print(f"学籍番号 {student_id} の {name} さんを登録しました。")

def update_student_info(student_data):


    student_id = input("変更する学生の学籍番号を入力してください: ")
    if student_id not in student_data:
        print("登録されていない学籍番号です。")
        return

    new_class = input("新しいクラスを入力してください (A, B, C): ")
    new_name = input("新しい氏名を入力してください: ")

    student_data[student_id]['class'] = new_class
    student_data[student_id]['name'] = new_name
    print(f"学籍番号 {student_id} の情報を更新しました。")

def display_students(student_data):


    print("\n登録された学生一覧:")
    for student_id, info in student_data.items():
        print(f"学籍番号: {student_id}, クラス: {info['class']}, 名前: {info['name']}")

def main():
    student_data = {}


    for _ in range(3):
        register_student(student_data)

    while True:
        update_student_info(student_data)

        continue_input = input("続けますか？(y/n): ")
        if continue_input.lower() != 'y':
            break

    display_students(student_data)
main()
