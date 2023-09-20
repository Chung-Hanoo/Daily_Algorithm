from collections import deque

def bfs(start, not_connect, tree, n):
    queue = deque()
    visited = [False for _ in range(n + 1)]
    count = 1
    
    queue.append(start)
    visited[start] = True
    
    while queue:
        current = queue.popleft()
        for next_node in tree[current]:
            if not visited[next_node] and next_node != not_connect:
                queue.append(next_node)
                visited[next_node] = True
                count += 1
    
    return count

def solution(n, wires):
    answer = n
    tree = [[] for _ in range(n + 1)] # 노드별 연결 정보 재구성
    
    for node in wires:
        tree[node[0]].append(node[1])
        tree[node[1]].append(node[0])
    
    for wire in wires:
        network1 = bfs(wire[0], wire[1], tree, n)
        network2 = bfs(wire[1], wire[0], tree, n)
        answer = min(abs(network1 - network2), answer)
        
    return answer