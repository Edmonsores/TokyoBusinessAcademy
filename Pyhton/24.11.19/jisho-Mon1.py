'''
ファイル名：jisho-Mon1
'''
syouhin = {'no01': 2500, 'no03': 5500, 'no10': 1200}	
print("変更前",syouhin)

syouhin['no02'] = 3600
del syouhin['no01']
syouhin['no03'] = 6000

print("変更後",syouhin)
