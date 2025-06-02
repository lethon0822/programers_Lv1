package Day02;

public class CountPAndY {
    // 문자열 내 p와 y의 개수
    class Solution {
        boolean solution(String s) {
            int cntP = 0;
            int cntY = 0;
            String[] arr = s.toLowerCase().split("");

            for (int i = 0; i < arr.length; i++){
                if ("p".equals(arr[i]))
                    cntP++;
                else if ("y".equals(arr[i]))
                    cntY++;
            }

            if (cntP == cntY)
                return true;
            else
                return false;

        }
    }
}
