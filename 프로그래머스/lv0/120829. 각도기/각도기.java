class Solution {
    public int solution(int angle) throws Exception {
        
        if(angle==180) {
            return 4;
        } else if(90<angle&&angle<180) {
            return 3;
        } else if(angle==90) {
            return 2;
        } else if(0<angle&&angle<90) {
            return 1;
        } else {
            throw new Exception("0-180 사이의 값을 입력해주세요");
        }
    }
}