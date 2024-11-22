N, M = map(int, input().split())

original = []   # 원래의 보드
count = []  # 다시 칠해야 하는 정사각형 개수를 저장하기 위한 변수

for _ in range(N):
    original.append(input())

# a, b : 행, 열에 대하여 원래의 체스판에서 8*8로 자를 수 있는 범위의 시작점
for a in range(N-7):
    for b in range(M-7):
        index1 = 0  # 'w'로 시작할 경우
        index2 = 0  # 'B'로 시작할 경우

        for i in range(a, a+8):
            for j in range(b, b+8):

                # (i+j)의 합이 짝수면 시작점과 색 동일, 홀수면 상이
                if (i+j) % 2 == 0:
                    if original[i][j] != 'W':
                        index1 += 1
                    if original[i][j] != 'B':
                        index2 += 1
                else:
                    if original[i][j] != 'B':
                        index1 += 1
                    if original[i][j] != 'W':
                        index2 += 1

        # 'W'로 시작/'B'로 시작할 경우 다시 칠해야 하는 정사각형 개수 중 작은 수 저장
        count.append(min(index1, index2))

print(min(count))