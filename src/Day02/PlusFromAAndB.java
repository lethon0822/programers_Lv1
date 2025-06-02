package Day02;

public class PlusFromAAndB {
    // 두 정수 사이의 합
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (long i = a; i <=b ; i++){
                answer += i;
            }
        } else if (a > b) {
            for (long i = a; i >=b ; i--){
                answer += i;
            }
        } else {
            answer = a;
        }
        return answer;
    }
}
