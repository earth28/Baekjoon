Y = [0 for i in range(9)]
K = [0 for i in range(9)]

T = int(input())

sum_Y = 0
sum_K = 0

for i in range(T) :
    y, k  = map(int, input().split())

    Y[i] = y
    K[i] = k

    sum_Y += Y[i]
    sum_K += K[i]

if sum_Y > sum_K :
    print("Yonsei")
elif sum_Y < sum_K :
    print("Korea")
else :
    print("Draw")