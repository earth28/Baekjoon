n = int(input())

if n % 5 == 0 : # 5로 나누어 떨어지는 경우
    print(n // 5)
else :
    count = 0

    while n > 0 :
        n -= 3
        count += 1

        if n % 5 == 0 : # 3과 5로 나누어 떨어지는 경우
            count += n // 5
            print(count)
            break
        elif n == 1 or n == 2 : # 주어진 무게로 나누어 떨어지지 않는 경우
            print(-1)
            break
        elif n == 0 :   # 3으로 나누어 떨어지는 경우
            print(count)
            break