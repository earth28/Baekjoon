import sys
input = sys.stdin.readline

N = int(input())
result = 0

for i in range(N):
    # 각 자릿수를 분해하여 숫자로 바꾼 후 split_num에 저장
    # sum()을 이용해 자릿수의 합을 구함
    split_sum = i + sum(map(int, str(i)))
    
    if split_sum == N:
        result = i
        break

print(result)