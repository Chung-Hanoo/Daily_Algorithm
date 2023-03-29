import sys

N, M = map(int, input().split())
list = [int(sys.stdin.readline()) for _ in range(N)]

start = 1
end = max(list)

while start <= end:
    mid = (start + end) // 2
    lines = 0

    for i in list:
        lines += i // mid

    if lines >= M:
        start = mid + 1
    else:
        end = mid - 1

print(end)