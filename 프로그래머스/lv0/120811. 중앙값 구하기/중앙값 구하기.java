class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        int tmp = 0;
        
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]>array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }    
        }
        
        answer = array[(array.length/2)];
        return answer;
    }
}