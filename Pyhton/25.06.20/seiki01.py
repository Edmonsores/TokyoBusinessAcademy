#P-208
import re
print(re.search(r'^a','abcde'))
print(re.search(r'e$','abcde'))
print(re.search(r'^A','abcde'))
print(re.search(r'^.....$','abcde'))
print(re.search(r'^...$','xyz'))
