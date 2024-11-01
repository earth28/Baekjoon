# 스택에 원소를 새로 넣었다 빼는 것은 무의미하므로 무시하고 큐만 고려

import sys
from collections import deque

n = int(input())
list1 = list(map(int, sys.stdin.readline().split()))
list2 = list(map(int, sys.stdin.readline().split()))

m = int(input())
list3 = list(map(int, sys.stdin.readline().split()))

dq = deque()

for i in range(n) :
    if list1[i] == 0 :
        dq.appendleft(list2[i])

for j in range(m) :
    dq.append(list3[j])
    print(dq.popleft(), end = ' ')