function solution(name) {
    let answer = 0;
    let min = name.length - 1;

    for (let i = 0; i < name.length; i++) {
        let currentAlphabet = name.charCodeAt(i);

        if (currentAlphabet < 78) // 알파벳 중간 N
          answer += currentAlphabet % 65;
        else
          answer += 91 - currentAlphabet;

        let nextIndex = i + 1;

        while (nextIndex < name.length && name.charCodeAt(nextIndex) === 65) {
          nextIndex += 1;
        }
        
        min = Math.min(
            min,
            i * 2 + name.length - nextIndex, // 먼저 오른쪽으로 가기
            i + (name.length - nextIndex) * 2 // 처음부터 반대로 가기
        );
      }
      answer += min;
      return answer;
}