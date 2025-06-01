package Day01;

public class DivideNum1 {
    // 나머지가 1이 되는 수 찾기
    public int solution(int n) {
        int result;
        int i = 2;

        while (true) {
            if (n % i == 1){
                result = i;
                break;
            }
            i++;
        }

        return result;
    }
}
