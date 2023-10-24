function solution(n, s, a, b, fares) {
    // 거리 그래프 생성
    let graph = Array.from(Array(n+1), () => Array(n+1).fill(Infinity))

    for (let [x, y, cost] of fares){
        graph[x][y] = cost;
        graph[y][x] = cost;
    }
    
    for (let i = 1; i <= n; i++) {
        graph[i][i] = 0; // 자기 자신으로 가는 거리는 0
    }
    
    // 플로이드 워셜 알고리즘
    for(let k = 1; k <= n; k++){
        for (let a = 1; a <= n; a++){
            for(let b = 1; b <= n; b++){
                graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
            }
        }
    }
    
    // 처음부터 각자 출발하는 경우
    let answer = graph[s][a] + graph[s][b];
    
    for(let i = 1; i <= n; i++){
        answer = Math.min(answer, graph[s][i] + graph[i][a] + graph[i][b]);
    }
    return answer;
}