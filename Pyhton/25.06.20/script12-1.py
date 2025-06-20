#P-217
import re
str1 = input('携帯番号を入力してください->')
if re.search(r'^0[0-9]0-[1-9][0-9]{3}-[0-9]{4}$', str1) is None:
    print('入力に誤りがあります')
else:
    print('正しい入力です')