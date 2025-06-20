#P-212
import re
if re.match(r'abc.*$','abcd1234'):
    print('パターンに当てはまりました')
else:
    print('パターンに当てはまりません')