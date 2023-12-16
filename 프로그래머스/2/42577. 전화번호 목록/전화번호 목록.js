function solution(phone_book) {
    phone_book.sort();
    let answer = true;
    for (let i = 0; i < phone_book.length - 1; i++) {
        const currentNum = phone_book[i];
        const futureNum = phone_book[i + 1];
        if (currentNum == futureNum.substring(0, currentNum.length))
            return false;
    }
    return true;
}