#P-211
import re
de='2001/03/03'
mo=re.search(r'([0-9]{4})/([0-9]{2})/([0-9]{2})','2001/03/03')
t=mo.groups()
print(t)