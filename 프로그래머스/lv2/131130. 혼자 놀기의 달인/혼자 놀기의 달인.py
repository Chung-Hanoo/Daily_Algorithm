def solution(cards):
    answer = 0
    group_sum = []  # 각 그룹의 합을 저장할 리스트
    group_type = 1  # 그룹 타입
    group_temp = 0  # 특정 그룹의 임시 합

    for i in range(len(cards)):
        if cards[i] < 0:
            continue
        else:
            cursor = i
            while cards[cursor] > 0:
                group_temp += 1
                temp = cursor
                cursor = cards[cursor] - 1
                cards[temp] = -group_type
            group_sum.append(group_temp)
            group_temp = 0
            group_type += 1  # 다음 그룹으로 이동

    group_sum.sort(reverse=True)

    if len(group_sum) < 2:
        return 0
    else:
        return group_sum[0] * group_sum[1]
