def validate_class_input():
    """
    ユーザーが入力したクラスが有効かどうかを検証します。
    有効な入力は 'A', 'B', 'C' のいずれかです。

    """
    while True:
        class_input = input("クラスを入力してください (A, B, C): ")
        if class_input in ['A', 'B', 'C']:
            return class_input
        print("無効なクラスです。A, B, C のいずれかを入力してください。")

def validate_student_id():
    """
    ユーザーが入力した学生IDが有効かどうかを検証します。
    有効な範囲は 1001 から 1100 です。

    """
    while True:
        student_id = input("学生IDを入力してください (1001-1100): ")
        try:
            student_id = int(student_id)
            if 1001 <= student_id <= 1100:
                return student_id
            else:
                print("無効な学生IDです。1001 から 1100 の間の数値を入力してください。")
        except ValueError:
            print("無効な学生IDです。有効な数値を入力してください。")

def get_student_info():
    """
    学生情報を入力させ、有効性を検証してから返します。

    """
    class_input = validate_class_input()
    student_id = validate_student_id()
    name = input("学生名を入力してください: ")
    return student_id, name

def display_student_info(student_id, name):
    """
    1名の学生情報を表示します。

    """
    print(f"学生ID: {student_id}, 名前: {name}")

def display_all_students(student_data):
    """
    全ての学生情報を一覧表示します。

    """
    print("\n登録された学生情報:")
    for student_id, name in student_data.items():
        print(f"学生ID: {student_id}, 名前: {name}")

def main():

    student_data = {}  # 学生情報を格納する辞書

    # 5名の学生情報を登録
    for _ in range(5):
        student_id, name = get_student_info()
        student_data[student_id] = name

    # 登録された学生情報を表示
    display_all_students(student_data)

# プログラムのエントリーポイント
main()

