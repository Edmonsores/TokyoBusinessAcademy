def get_student_info():

    while True:
        class_input = input("クラスを入力してください (A, B, C): ")
        if class_input not in ['A', 'B', 'C']:
            print("無効なクラスです。A, B, C のいずれかを入力してください。")
            continue

        student_id = input("学生IDを入力してください (1001-1100): ")
        try:
            student_id = int(student_id)
            if not 1001 <= student_id <= 1100:
                print("無効な学生IDです。1001 から 1100 の間の数値を入力してください。")
                continue
        except ValueError:
            print("無効な学生IDです。有効な数値を入力してください。")
            continue

        name = input("学生名を入力してください: ")
        return class_input, student_id, name

def register_student(student_data):

    class_input, student_id, name = get_student_info()
    student_data[student_id] = {'class': class_input, 'name': name}
    print(f"学生ID {student_id} の {name} さんを登録しました。")

def display_students(student_data):


    print("\n登録された学生一覧:")
    for student_id, info in student_data.items():
        print(f"学生ID: {student_id}, クラス: {info['class']}, 名前: {info['name']}")

def main():
    student_data = {}  # 学生情報の辞書

    # 3人の学生情報を登録
    for i in range(3):
        register_student(student_data)

    # 登録された学生一覧を表示
    display_students(student_data)
main()
