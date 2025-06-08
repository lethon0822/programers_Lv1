package Day04;

public class Watermelon {
    // 홀수면 수, 짝수면 박 출력하기
    public String solution(int n) {
        String strSum = "";
        for (int i = 0; i<n; i++) {
            strSum += i % 2 == 0 ? "수" : "박";
        }
        return strSum;
    }
}
