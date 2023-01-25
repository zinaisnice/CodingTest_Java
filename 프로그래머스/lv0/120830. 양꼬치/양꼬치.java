class Solution {
    public int solution(int n, int k) {
        
        int answer=0;
        int price = (12000*n)+(2000*k);
        int discount = 2000*(n/10);
        
        if(n/10>0) {
            answer = price-discount;
        } else {
            answer = price;
        }

        return answer;
    }
}