S = int(input())

i = 0
count = 0

while True :
    if S > i :
        i += 1
        S -= i
        count += 1
    else :
        print(count)
        break