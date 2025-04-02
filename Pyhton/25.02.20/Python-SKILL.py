def bubble_sort(arr):
    # Sorts TBLNO in ascending order using Bubble Sort.
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - 1 - i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

def binary_search(arr, key):
    # Search for a product number in TBLNO using Binary Search.
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == key:
            return mid
        elif arr[mid] < key:
            left = mid + 1
        else:
            right = mid - 1
    return -1  # Not found

def find_top_selling(TBLG, TBLM):
    # Finds and displays the top-selling product.
    max_index = 0
    for i in range(1, len(TBLG)):
        if TBLG[i] > TBLG[max_index]:
            max_index = i
    print("Top-selling product:", TBLM[max_index], "with sales amount", TBLG[max_index])

TBLNO = [205, 201, 209, 202, 206, 200, 203, 204, 208, 207]  # Product numbers
TBLT = [100, 200, 300, 400, 550, 600, 650, 700, 750, 800]  # Unit prices
TBLM = ['A品', 'B品', 'C品', 'D品', 'E品', 'F品', 'G品', 'H品', 'I品', 'J品']  # Product names
TBLG = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]  # Sales amounts, initialized to 0

# Sort TBLNO in ascending order
bubble_sort(TBLNO)
print("Sorted TBLNO:", TBLNO)

# Input sales data
for i in range(len(TBLNO)):
    while True:
            product_no = int(input("Enter product number: "))
            index = binary_search(TBLNO, product_no)
            if index == -1:
                print("Input error: Product not found. Try again.")
                continue
            quantity = int(input("Enter sales quantity: "))
            TBLG[index] = TBLT[index] * quantity
            break

# Find and display the top-selling product
find_top_selling(TBLG, TBLM)

# Print final TBLG
print("Final TBLG:", TBLG)


