N = int(input())
user = []

for _ in range(N) :
    age, name = input().split()
    user.append([int(age), name])

# lambda 함수를 이용해 나이를 기준으로 정렬
for i in sorted(user, key = lambda x : x[0]) :
    print(i[0], i[1])