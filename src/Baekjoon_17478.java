import java.io.*;

public class Baekjoon_17478 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.parseInt(br.readLine());

        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        bw.write(repeat(max, 0));
        bw.flush();
        bw.close();
    }

    // 재귀함수 repeat. 문단별로 나누어 생성하도록함.
    public static String repeat(int max, int count) {
        StringBuilder full = new StringBuilder();

        // 반복되는 밑줄 길이 생성
        String underLine = "____";
        if (count == 0) {
            underLine = "";
        } else {
            underLine = underLine.repeat(Math.max(0, count));
        }

        if (count == max) {
            String[] string = {"\"재귀함수가 뭔가요?\"\n",
                    "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n",
                    "라고 답변하였지.\n"
            };

            // 반복되는 문자열 append
            for (int i = 0; i < 3; i++) {
                full.append(underLine);
                full.append(string[i]);
            }

            return full.toString();
        } else {
            String[] string = {"\"재귀함수가 뭔가요?\"\n",
                    "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
                    "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
                    "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n",
                    "라고 답변하였지.\n"
            };

            // 반복되는 문자열 append
            for (int i = 0; i < 4; i++) {
                full.append(underLine);
                full.append(string[i]);
            }

            full.append(repeat(max, ++count));
            full.append(underLine);
            full.append(string[4]);

            return full.toString();
        }
    }
}
