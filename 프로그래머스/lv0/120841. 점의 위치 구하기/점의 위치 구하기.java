class Solution {
    public int solution(int[] dot) {
       
        int answer;
        
        int x = dot[0];
        int y = dot[1];
        
        if(x>0 && y>0) {
            return answer = 1;
        } else if (x<0 && y>0) {
            return answer = 2;
        } else if (x<0 && y<0) {
            return answer = 3;
        } else if (x>0 && y<0) {
            return answer = 4;
        } else {
            return answer = 0;
        }

    }
}