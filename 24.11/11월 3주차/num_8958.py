T = int(input())

for _ in range(T) :
    s = input()
    score = 0
    sum = 0

    for i in s :    # 문자열에도 반복문 사용 가능
        if i == 'O' :
            score += 1
        else :
            score = 0

        sum += score

    print(sum)