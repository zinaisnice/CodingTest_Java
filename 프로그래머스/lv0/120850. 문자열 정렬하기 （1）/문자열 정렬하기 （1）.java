import java.util.*;

class Solution {
    public int[] solution(String my_string) {
               
        String replaceStr = my_string.replaceAll("[a-z]","");
        String[] split = replaceStr.split("");
        int[] answer = new int[split.length];
        
        for(int i=0; i<split.length; i++) {
            answer[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}