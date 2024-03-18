import math

def solution(stones, k):
    answer = 0
    
    start = 1
    end = 200000000
    
    while start <= end:
        mid = math.floor((start + end) / 2)
        skip = 0
        
        for stone in stones:
            if stone < mid:
                skip += 1
            else:
                skip = 0
            if skip >= k:
                break
        
        if skip >= k:
            end = mid - 1
        else:
            start = mid + 1
               
    return end