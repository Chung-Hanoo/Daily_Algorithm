function solution(n, t, m, timetable) {
     // 시간을 분으로 변경
    timetable = timetable.map(time => {
        let [hour, minute] = time.split(':');
        return Number(hour) * 60 + Number(minute);
    });
    timetable.sort((a, b) => a - b); // 오름차순으로 정렬 수정
    
    let start = 540; // 첫 버스 시간
    let lastTime = 540 + (n - 1) * t; // 마지막 버스 시간
    let busOnPerson = 0; // 현재 버스에 탄 사람 수
    let lastBusPerson = 0; // 마지막 버스에 탄 사람 수
    
    for (let i = 0; i < n; i++) { // 모든 버스에 대해 반복
        let cnt = 0; // 이번 버스에 탈 수 있는 사람 수
        while (cnt < m && busOnPerson < timetable.length && timetable[busOnPerson] <= start) {
            cnt++;
            busOnPerson++;
        }
        start += t; // 다음 버스 시간으로 업데이트
        if (i === n - 1) lastBusPerson = cnt;
    }
    
    let answer;
    if (busOnPerson < m * n && lastBusPerson < m) {
        // 마지막 버스가 가득 차지 않은 경우, 마지막 버스 시간에 도착
        answer = lastTime;
    } else {
        // 마지막 버스가 가득 찬 경우, 마지막으로 탄 사람보다 1분 빨리 도착
        answer = timetable[busOnPerson - 1] - 1;
    }
    
    // 분을 시각으로 변경
    let hour = Math.floor(answer / 60);
    hour = hour < 10 ? `0${hour}` : hour;
    let minute = answer % 60;
    minute = minute < 10 ? `0${minute}` : minute;
    
    return `${hour}:${minute}`;
}