import sys
import math
input = sys.stdin.readline

def solution(n,a,b):
    answer = 0
    
    # 처음 지수 승만 이용
    n = math.log2(n)
    
    if a>b:
        a,b = b,a
    
    # 전체 입력의 지수 = 총 단계 횟수
    while n>0:
        answer = answer + 1
        a = math.ceil(a/2)
        a = a if a != 0 else 1
        b = math.ceil(b/2)
        if(b-a==0):
            break
        n=n-1

    return answer