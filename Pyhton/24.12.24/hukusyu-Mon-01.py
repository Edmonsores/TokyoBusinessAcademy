
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

def display_student_info(class_input, student_id, name):
    
    print(f"クラス: {class_input}, 学生ID: {student_id}, 名前: {name}")

def main():
    class_input, student_id, name = get_student_info()
    display_student_info(class_input, student_id, name)

main()
