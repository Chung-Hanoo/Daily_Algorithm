function solution(numbers) {
    let length = numbers.length;
    let answer = new Array(length).fill(-1);
    let stack = [];
    
    for(let i = length - 2; i >= 0; i--){
        if(numbers[i] < numbers[i + 1]){
            answer[i] = numbers[i + 1];
            stack.unshift(numbers[i+1]);
        }
        while(stack.length != 0){
            let tmpMax = stack.shift();
            if(numbers[i] < tmpMax){
                answer[i] = tmpMax;
                stack.unshift(tmpMax);
                break;
            }
        }
    }
    
    return answer;
}