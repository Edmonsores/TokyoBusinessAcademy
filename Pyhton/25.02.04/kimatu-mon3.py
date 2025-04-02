# 昇順 Ascending (バブルソート)
def bubble_sort(lst):
    n = len(lst)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if lst[j] > lst[j + 1]:
                temp = lst[j]  
                lst[j] = lst[j + 1]  
                lst[j + 1] = temp 
    return lst

# 降順 Descending (単純選択法)
def selection_sort(lst):
    n = len(lst)
    for i in range(n):
        max_idx = i
        for j in range(i + 1, n):
            if lst[j] > lst[max_idx]:
                max_idx = j
        temp = lst[i]  
        lst[i] = lst[max_idx]  
        lst[max_idx] = temp
    return lst
# 昇順か降順の値 ascending or descending order
def sort_list(lst, order):
    if order == 1:
        return bubble_sort(lst)
    elif order == 2:
        return selection_sort(lst)
    else:
        print("エラー")

# Main process
TBL = [20, 60, 50, 10, 70, 30, 90, 100, 85, 65]
order = int(input("昇順の場合は1、降順の場合は2を入力してください: "))
sorted_list = sort_list(TBL, order)
print("並び替えたリスト:", sorted_list)
