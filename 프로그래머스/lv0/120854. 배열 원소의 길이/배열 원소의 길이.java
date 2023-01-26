class Solution {
    public int[] solution(String[] strlist) {
        
        int strlist_len = strlist.length;
        int[] answer= new int[strlist_len];
        
        for(int i=0; i<strlist_len; i++) {
             answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}