# kan-mon2

def display_multiples_of_three(value):
    if value % 3 == 0:  
        print(f"{value} は3の倍数です。")


def main():
    TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]
    
    for value in TBL:
        display_multiples_of_three(value)
main()
