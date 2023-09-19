def solution(record):
    answer = []
    user_data = dict()
    
    for s in record:
        temp = s.split()
        if temp[0] == "Leave":
            continue
        else:
            user_data[temp[1]] = temp[2]
    
    for s in record:
        temp = s.split()
        if temp[0] == "Enter":
            info = user_data[temp[1]] + "님이 들어왔습니다."
            answer.append(info)
        elif temp[0] == "Leave":
            info = user_data[temp[1]] + "님이 나갔습니다."
            answer.append(info)
        else:
            continue
            
    return answer