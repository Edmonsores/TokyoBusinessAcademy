
def validate_input(class_input, student_id):
    # Add input validation logic here (for now, we'll assume it always returns True)
    return True

def register_student(student_data):
    class_input = input("クラスを入力してください (A, B, C): ")
    student_id = input("学籍番号を入力してください (1001-1100): ")
    name = input("氏名を入力してください: ")

    # 入力値の検証は問題1の関数validate_input()を利用
    if not validate_input(class_input, student_id):
        print("入力エラーです。もう一度入力してください。")
        return

    # 学生情報の登録
    student_data[student_id] = {'class': class_input, 'name': name}
    
    # 3教科の点数を登録
    scores = input_scores()
    student_data[student_id]['scores'] = scores
    
    print(f"学籍番号 {student_id} の {name} さんを登録しました。")

def input_scores():
    scores = []
    for subject in ["国語", "数学", "英語"]:
        while True:
            try:
                score = int(input(f"{subject} の点数を入力してください (0-100): "))
                if 0 <= score <= 100:
                    scores.append(score)
                    break
                else:
                    print("0から100の範囲で入力してください。")
            except ValueError:
                print("無効な入力です。数字で入力してください。")
    return scores

def update_student_info(student_data):
    student_id = input("変更する学生の学籍番号を入力してください: ")
    if student_id not in student_data:
        print("登録されていない学籍番号です。")
        return

    new_class = input("新しいクラスを入力してください (A, B, C): ")
    new_name = input("新しい氏名を入力してください: ")

    student_data[student_id]['class'] = new_class
    student_data[student_id]['name'] = new_name

    # 3教科の点数を更新
    print("新しい点数を入力してください。")
    scores = input_scores()
    student_data[student_id]['scores'] = scores

    print(f"学籍番号 {student_id} の情報を更新しました。")

def display_students(student_data):
    print("\n登録された学生一覧:")
    for student_id, info in student_data.items():
        scores_str = ", ".join(map(str, info['scores']))
        print(f"学籍番号: {student_id}, クラス: {info['class']}, 名前: {info['name']}, 点数: {scores_str}")

def main():
    student_data = {}

    # Register students
    for _ in range(3):
        register_student(student_data)

    # Update student information
    while True:
        update_student_info(student_data)

        continue_input = input("続けますか？(y/n): ")
        if continue_input.lower() != 'y':
            break

    # Display registered students
    display_students(student_data)


main()


