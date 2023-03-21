import sys
# 반복문으로 여러줄을 입력 받는 상황에서는 반드시 sys.stdin.readline()을 사용해야한다.
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    data = []
    pass_person = 1

    data = [list(map(int, input().split())) for _ in range(N)]

    data = sorted(data)
    
    # Compare by company rule
    ranking_min = data[0][1]
    for j in range(1, N):
        if data[j][1] < ranking_min:
            pass_person += 1
            ranking_min = data[j][1]

    print(pass_person)