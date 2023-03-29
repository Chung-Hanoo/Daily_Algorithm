import sys

def binary_search(list, target):
    start, end = 0, len(list)-1
    result = 0

    while start <= end:
        mid = (start + end) // 2
        if list[mid] ==  target:
            result = 1
            return result
        elif list[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return result

T = int(input())

for i in range(T):
    N = int(input())
    book1 = list(map(int, sys.stdin.readline().split()))
    book1.sort()

    M = int(input())
    book2 = list(map(int, sys.stdin.readline().split()))

    for i in book2:
        print(binary_search(book1, i))
