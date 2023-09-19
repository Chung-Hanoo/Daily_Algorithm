from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]

def island_bfs(maps, x, y):
    max_x = len(maps)
    max_y = len(maps[0])
    
    day_sum = 0
    deq = deque()
    deq.append((x, y))
    
    while deq:
        x, y = deq.popleft()
        if maps[x][y] != 'X':
            day_sum += int(maps[x][y])
            maps[x][y] = 'X'  # 수정된 값을 'X'로 대체

            for i in range(4):
                nx, ny = x + dx[i], y + dy[i]
                if 0 <= nx < max_x and 0 <= ny < max_y:
                    if maps[nx][ny] != 'X' and int(maps[nx][ny]) > 0:
                        deq.append((nx, ny))
    
    return maps, day_sum


def solution(maps):
    answer = []

    # 입력된 문자열 리스트를 리스트로 변환
    for i in range(len(maps)):
        maps[i] = list(maps[i])

    for i in range(len(maps)):
        for j in range(len(maps[0])):
            if maps[i][j] != 'X' and int(maps[i][j]) > 0:
                maps, answer_temp = island_bfs(maps, i, j)
                answer.append(answer_temp)
                
    if len(answer) == 0:
        answer = [-1]
    else:
        answer.sort()
    
    return answer