package Day01;

public class ArrayNumberAVG {
    // 평균값 구하기
    public double solution(int[] arr) {
        double sum = 0.0;

        for (int i= 0; i<arr.length; i++) {
            sum += arr[i];
        }
        sum = sum / arr.length;
        return sum;
    }
}
