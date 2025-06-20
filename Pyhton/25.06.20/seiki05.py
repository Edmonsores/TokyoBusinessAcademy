#P-210
import re
print(re.search(r'^[abc]','abcde'))
print(re.search(r'^[abc]','defgh'))

print(re.search(r'^[0-9]{4}$','1234'))
