function solution(stones, k) {
    let start = 1;
    let end = 200000000;
    
    while (start <= end) {
        let mid = Math.floor((start + end) / 2);
        let skip  = 0;
        
        for (let stone of stones) {
            if (stone < mid) skip++;
            else skip = 0;
            if (skip >= k) break;
        }
        
        if (skip >= k) end = mid - 1;
        else start = mid + 1;
    }
    
    return end;
}