def get_student_info():
    """
    学生のクラス、ID、名前を入力し、バリデーションを行う。
    """
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

def display_class_list(class_lists):
    """
    クラスごとの学生名簿を表示する。
    """
    print("\nクラスごとの学生名簿:")
    for class_name, students in class_lists.items():
        print(f"\nクラス {class_name}:")
        for student in students:
            print(f"  学生ID: {student['id']}, 名前: {student['name']}")

def main():
    """
    メイン関数。学生情報を入力し、クラスごとの名簿を作成。
    """
    class_lists = {'A': [], 'B': [], 'C': []}  # 各クラスの名簿を初期化

    print("学生情報を登録してください。")
    num_students = int(input("登録する学生の人数を入力してください: "))

    for _ in range(num_students):
        class_input, student_id, name = get_student_info()
        class_lists[class_input].append({'id': student_id, 'name': name})

    display_class_list(class_lists)
    
main()
