# 프로그래머스 테스트 3번부터 틀리는데 왜 틀리는지 모르겠다...

import sys
input = sys.stdin.readline


def compareSame(s):
    same_ = True
    for i in range(len(s)):
        if (s[0] != s[i]):
            same_ = False
            break
    return same_


def cal_beautiful(start, end, s, case_list):
    if start >= end:
        return 0

    left = cal_beautiful(start, end-1, s, case_list)
    right = cal_beautiful(start+1, end, s, case_list)


    if s[start] == s[end-1]:
        result = 0
    else:
        result = end-start-1

    if result < left or result < right:
        result = left if left > right else right

    case_list[s[start:end]] = result

    return result


def solution(s):
    if compareSame(s):
        answer = 0
        return answer

    answer = 0
    case_list = {}
    cal_beautiful(0, len(s), s, case_list)

    for i in case_list.values():
        answer += i

    return answer