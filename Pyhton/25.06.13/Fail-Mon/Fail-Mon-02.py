filename = 'seiseki.txt'
# input and write to file 入力してファイルに書き込む
try:
    with open(filename, 'w', encoding='utf-8') as f:
        print("Enter student's data. Type 'end' to stop.")
        while True:
            name = input("Name (or 'end' to finish): ")
            if name == 'end':
                break
            subject = input("Subject: ")
            try:
                score = int(input("Score: "))
            except ValueError:
                print("Invalid score. Please enter a number.")
                continue

            line = name + "：\t" + subject + "\t" + str(score) + "\n"
            f.write(line)
        print("Data written to seiseki.txt.\n")
except Exception as e:
    print("Error writing to file:", e)

# Read and display the contents of the file ファイルの内容を読み取り、表示する
try:
    with open(filename, 'r', encoding='utf-8') as f:
        print("=== seiseki.txt Contents ===")
        print(f.read())
except FileNotFoundError:
    print("File not found.")
except Exception as e:
    print("Error reading file:", e)
