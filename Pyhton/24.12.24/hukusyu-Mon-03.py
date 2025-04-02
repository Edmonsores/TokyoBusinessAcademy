def validate_input(class_input, student_id):

    if class_input not in ['A', 'B', 'C']:
        return False
    try:
        student_id = int(student_id)
        if not 1001 <= student_id <= 1100:
            return False
    except ValueError:
        return False
    return True

def get_student_info():

    while True:
        class_input = input("クラスを入力してください (A, B, C): ")
        student_id = input("学生IDを入力してください (1001-1100): ")
        if validate_input(class_input, student_id):
            name = input("学生名を入力してください: ")
            return class_input, student_id, name
        else:
            print("入力エラーです。もう一度入力してください。")

def register_student(student_data):

    class_input, student_id, name = get_student_info()
    student_data[student_id] = {'class': class_input, 'name': name}
    print(f"学生ID {student_id} の {name} さんを登録しました。")

def display_students(student_data):

    print("\n登録された学生一覧:")
    for student_id, info in student_data.items():
        print(f"学生ID: {student_id}, クラス: {info['class']}, 名前: {info['name']}")

student_data = {} 

for i in range(10):
    register_student(student_data)

display_students(student_data)
