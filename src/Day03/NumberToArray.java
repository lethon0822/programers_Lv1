package Day03;

public class NumberToArray {
    public int[] solution(long n) {
        String[] numArr = String.valueOf(n).split("");
        int[] answer = new int[numArr.length];

        for (int i = 0; i<numArr.length; i++){
            String num = numArr[numArr.length -1 -i];
            answer[i] = Integer.parseInt(num);
        }
        return answer;
    }
}
