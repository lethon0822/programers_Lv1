package Day02;

public class XandN {
    // x만큼 간격이 있는 n개의 숫자
    public long[] solution(int x, int n) {
        long[] numbers = new long[n];
        long num = x;
        for (int i = 0 ; i < n; i++){
            numbers[i] = num;
            num += x;
        }
        return numbers;
    }
}
