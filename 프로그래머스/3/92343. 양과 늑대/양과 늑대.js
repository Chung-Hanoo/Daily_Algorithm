function solution(info, edges) {
  let answer = 0;
  const graph = Array.from({ length: info.length }, () => []);

  // 그래프 생성
  edges.forEach((value) => graph[value[0]].push(value[1]));

  const dfs = (current, sheepCount, wolfCount, queue) => {
    if (info[current] === 0) {
      sheepCount++;
      answer = Math.max(sheepCount, answer);
    } else {
      wolfCount++;
    }

    // 만약 늑대가 양을 잡아 먹을 조건일 때
    if (sheepCount === wolfCount) return;
    else {
      graph[current].forEach((value) => queue.push(value));
      queue.forEach((nextNode, index) => {
        let tmpQueue = [...queue];
        tmpQueue.splice(index, 1);
        dfs(nextNode, sheepCount, wolfCount, tmpQueue);
      });
    }
  };

  dfs(0, 0, 0, []);

  return answer;
}