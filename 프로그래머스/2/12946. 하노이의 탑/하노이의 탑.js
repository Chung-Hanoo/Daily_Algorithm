function solution(n) {
    let answer = [];
    const hanoi = (n, start, via, end) => { // 원판 수, 시작, 경유, 목적지
        if (n === 1) {
            answer.push([start, end]);
            return;
        }    
        hanoi(n - 1, start, end, via); // 시작지점에서 n-1개 원판 경유지에 옮김
        answer.push([start, end]); // 시작지점에서 n 번 원판 목적지에 옮김
        hanoi(n - 1, via, start, end); // 경유지의 n-1번째 원판을 목적지로 옮김
    };
    
    hanoi(n, 1, 2, 3);

    return answer;
}