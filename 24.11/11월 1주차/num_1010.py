import math

t = int(input())

for _ in range(t) :
    n, m = map(int, input().split())
    comb = math.factorial(m) // (math.factorial(m - n) * math.factorial(n))
    print(comb)