# ファイル作成（初期データ）
try:
    with open('students.txt', 'w', encoding='utf-8') as file:
        file.write('丸山，64，98，79\n')
        file.write('三村，48，87，92\n')
        file.write('佐藤，100，40，65\n')
        file.write('古川，83，81，74\n')
except Exception as e:
    print("ファイル作成エラー: ",e)

# ファイル読み込みと表示
try:
    with open('students.txt', encoding='utf-8') as file:
        content = file.read()
        print("名前，数学，英語，国語")
        print(content)
except FileNotFoundError:
    print("エラー: students.txt が見つかりません。")
except Exception as e:
    print("読み込みエラー:",e)

