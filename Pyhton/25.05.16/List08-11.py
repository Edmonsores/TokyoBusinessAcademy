# 学生クラスの定義
class Student:
    # クラス変数（全員の国語の合計を格納する）
    goukei = 0

    # コンストラクタ（インスタンス生成時に呼び出される）
    def __init__(self, in_name, in_math, in_eng, in_jpn):
        self.name = in_name
        self.math = in_math
        self.english = in_eng
        self.japanese = in_jpn

    # 学生の情報を表示するインスタンスメソッド
    def show_detail(self):
        print('名前:', self.name)
        print('数学:', self.math)
        print('英語:', self.english)
        print('国語:', self.japanese)

    # 合計点を返す
    def get_total(self):
        return self.math + self.english + self.japanese

    # 平均点を返す
    def get_average(self):
        return self.get_total() / 3

    # クラスメソッド：全体の国語点数合計を加算
    @classmethod
    def sumfunc(cls, student):
        cls.goukei += student.japanese


# ---------- メイン処理 ----------
# 学生のリストを初期化
Students = []

# 3人分の学生データを入力する
for i in range(3):
    print(f'\n{i+1}人目の学生情報を入力してください：')
    name1 = input('名前：')
    math1 = int(input('数学の点数：'))
    eng1 = int(input('英語の点数：'))
    jpn1 = int(input('国語の点数：'))

    # 学生インスタンスを作成し、リストに追加
    add = Student(name1, math1, eng1, jpn1)
    Students.append(add)

# 学生ごとの詳細情報を表示
print("学生情報:")
for student in Students:
    student.show_detail()

# クラスメソッドを使って国語の点数を合計
print("国語の合計点計算中:")
for student in Students:
    Student.sumfunc(student)

# 国語の合計点を出力
print('全員の国語の合計点:', Student.goukei)

