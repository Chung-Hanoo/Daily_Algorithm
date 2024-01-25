function solution(n) {
    let answer = "";
    let nums = ["4", "1", "2"]
    while (n > 0) {
        answer = nums[n % 3] + answer;
        n = n % 3 === 0 ? (n / 3) - 1 : Math.floor(n / 3);
    }
    
    return answer;
}