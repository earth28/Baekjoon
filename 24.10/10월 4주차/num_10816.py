import sys

N = int(sys.stdin.readline().strip())
map1 = list(map(int, sys.stdin.readline().strip().split()))

M = int(sys.stdin.readline().strip())
map2 = list(map(int, sys.stdin.readline().strip().split()))

dict = {}

for i in map1 :
    if i in dict :
        dict[i] += 1
    else :
        dict[i] = 1

for j in map2 :
    if j in dict :
        print(dict[j], end = ' ')
    else :
        print(0, end = ' ')