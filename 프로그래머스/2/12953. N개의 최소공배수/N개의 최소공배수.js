function solution(arr) {
    const prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97];
    let answer = 1;
    let arrPrime = Array.from({length: 101}, v => 0);
    arr.forEach((value, index) => {
        let eachNumPrime = Array.from({length: 101}, v => 0);
        while (value > 1) {
            for (let i = 0; i < prime.length; i++) {
                if (value % prime[i] == 0) {
                    value = value / prime[i];
                    eachNumPrime[prime[i]]++;
                    break;
                }
            }
        }
        for (let i = 0; i < prime.length; i++) {
            arrPrime[prime[i]] = arrPrime[prime[i]] < eachNumPrime[prime[i]] ? eachNumPrime[prime[i]] : arrPrime[prime[i]]
        }
    })
    for (let i = 0; i < prime.length; i++) {
        if (arrPrime[prime[i]] > 0){
            answer = answer * prime[i] ** arrPrime[prime[i]];
        }
    }
    return answer;
}