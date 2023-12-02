// 구현
function solution(n) {
    let answer = [];
    let triangleCount = 1;
    let triangleCountMax = Math.ceil(n/3);
    let count = 1;
    let triangle = Array.from({length: n}, (v, i) => Array.from({length: i + 1}, () => -1));
    
    while(triangleCount <= triangleCountMax) {
        const startFloor = (triangleCount - 1) * 2; 
        const bottomFloor = n - triangleCount;
        const startIndex = triangleCount - 1;
        
        triangle = triangle.map((v, i) => {
            if (startFloor <= i && i != bottomFloor)
                v[startIndex] = v[startIndex] == -1 ? count++ : v[startIndex];
            else {
                v = v.map((value) => value == -1 ? value = count++ : value);
            }
            return v;
        });

        for(let i = n - 1; i > 0; i--){
            if (startFloor < i && i < bottomFloor) {
                const lastIndex = triangle[i].length - 1 - startIndex;
                triangle[i][lastIndex] = triangle[i][lastIndex] == -1 ? count++ : triangle[i][lastIndex];
            }
        }
        
        triangleCount++;
    }
    
    triangle.forEach(value => {
        answer = [...answer, ...value];
    });
    return answer;
}