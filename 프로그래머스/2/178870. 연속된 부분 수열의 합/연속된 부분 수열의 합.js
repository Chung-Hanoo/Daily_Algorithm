const compare = (left, right, answer) => {
    let answer_length = answer[1] - answer[0];
    let tmp_length = right - left;
    
    if(answer_length > tmp_length){
        answer = [left, right];
    }
    return answer;
}

function solution(sequence, k) {
    let sequence_length = sequence.length;
    let answer = [0, sequence_length-1];
    let left = 0; // 범위의 시작점
    let right = 0; // 범위의 마지막 지점
    let sum = sequence[0]; // 초기 sequence[0, 0]의 값
    
    // 투 포인터 알고리즘
    while(left <= right && right < sequence_length){
        if(sum == k){ 
            answer = compare(left, right, answer) // answer와 두 pointer를 비교
            sum -= sequence[left++]; // 다음 검색을 위해 left번째 값 빼기
        }
        else if (sum > k){
            sum -= sequence[left++]; // 조건 만족을 위해 left번째 값 빼기
        }else{
            sum += sequence[++right]; //조건 만족을 위해 right + 1번째 값 더하기
        }
    }
    
    return answer;
}