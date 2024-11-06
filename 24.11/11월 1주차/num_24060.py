def mergeSort(arr, p, r) :  # arr 오름차순 정렬
    if p < r :
        q = (p + r) // 2    # q는 p, r의 중간 지점
        mergeSort(arr, p, q)    # 왼쪽 부분 정렬
        mergeSort(arr, q + 1, r)    # 오른쪽 부분 정렬
        merge(arr, p, q, r) # 정렬된 부분정렬 병합

def merge(arr, p, q, r) :
    global count, res
    i = p
    j = q + 1
    temp = []

    while i <= q and j <= r :
        if arr[i] <= arr[j] :
            temp.append(arr[i])
            i += 1
        else :
            temp.append(arr[j])
            j += 1

    # 왼쪽 또는 오른쪽 배열이 남은 경우 
    while i <= q :
        temp.append(arr[i])
        i += 1

    while j <= r :
        temp.append(arr[j])
        j += 1
    
    i = p
    t = 0

    # temp에 저장된 결과를 원래 배열에 저장
    while i <= r :
        arr[i] = temp[t]
        count += 1

        if count == K :
            res = arr[i]
            break

        i += 1
        t += 1

N, K = map(int, input().split())
arr = list(map(int, input().split()))

count = 0
res = -1

mergeSort(arr, 0 , N - 1)
print(res)