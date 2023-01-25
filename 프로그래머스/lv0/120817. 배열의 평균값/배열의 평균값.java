class Solution {
    public double solution(int[] numbers) {
        int tot = 0;
        
        for(int i=0; i<numbers.length; i++) {
            tot += numbers[i];
        }
        
        double answer = (double)tot/numbers.length;
        return answer;
    }
}