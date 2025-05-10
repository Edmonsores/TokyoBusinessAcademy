'''
クラス変数とクラスメソッドの例題
'''

class StudentCard:
    school_name='ビジネスアカデミー'
    def __init__(self, in_id, in_name):
        self.id=in_id
        self.name=in_name

    def print_info(self):
        print('学校名：',StudentCard.school_name)
        print('学籍番号：',self.id)
        print('氏名：',self.name)

    @classmethod
    def summethod(cls, in_t1, in_t2):
        goukei=in_t1+in_t2
        return goukei

#メイン
t1=int(input('点数１⇒'))
t2=int(input('点数２⇒'))
name = input('生徒名を入力してください⇒')
no = int(input('学籍番号を入力してください⇒'))

#インスタンス生成
add=StudentCard(no, name)
add.print_info()

go = StudentCard.summethod(t1, t2)
print('合計点:', go)
