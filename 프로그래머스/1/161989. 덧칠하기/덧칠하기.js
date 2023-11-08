function solution(n, m, section) {
    let answer = 0;
    let paintStart = section[0];
    
    section.forEach((value, index) => {
        if(index == 0){
            answer++;
            return;
        }
        else if(value < paintStart + m){
            return;
        }
        else{
            paintStart = value;
            answer++;
        }
    });
    
    return answer;
}