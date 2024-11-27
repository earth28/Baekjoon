N = int(input())
num = []

for _ in range(N) :
    num.append(int(input()))

sorted_num = sorted(num)

for i in range(len(num)) :
    print(sorted_num[i])