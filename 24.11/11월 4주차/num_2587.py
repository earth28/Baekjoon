num = []
sum = 0

for _ in range(5) :
    number = int(input())

    num.append(number)
    sum += number

num2 = sorted(num)

print(sum // 5)
print(num2[2])