n = int(input())
n_list = list(map(int,input().split(sep=' ')))
m = int(input())
m_list = list(map(int,input().split(sep=' ')))

limit = int(m/n)
shallow = '-1'
deep = '-1'
answer = ''

for i in range (0,m+1):
    if not n_list[0] in m_list:
        answer = '-1'
        break;

    first = m_list.index(n_list[0])
    if first == -1 and shallow == '-1':
        answer = '-1'
        break

    length = first + i * (n-1) + n
    while length <= len(m_list):
        # print('i: '+str(i)+', fisrt: '+str(first)+', length: '+str(length)+', m_list[first:]: '+str(m_list[first:]))
        if i != 0:
            temp = m_list[first:length:i+1]
        else:
            temp = m_list[first:length]

        # print('temp: '+str(temp))
        if temp == n_list:
            if shallow == '-1':
                shallow = str(i)
                deep = str(i)
                answer = shallow + ' '+ deep
            else:
                deep = str(i)
                answer = shallow + ' '+ deep
        # print()

        if n_list[0] in m_list[first+1:]:
            first = m_list[first+1:].index(n_list[0]) + first + 1
            if first == -1: break
            length = first + i * (n-1) + n
        else: break

print(answer)
