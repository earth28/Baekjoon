import sys

input = sys.stdin.readline
n = int(input())
arr = [0] * 10001

for _ in range(n) : # _ : 변수값 필요없을 때 사용
    arr[int(input())] += 1
    
for i in range(len(arr)) :
    if arr[i] != 0 :
        for _ in range(arr[i]) :
            print(i)