//My #002 Practice TapeEquilibrium By: Peerapat R.
class Solution {
    public int solution(int[] A) {
        int sum = 0;
        for(int i=0;i<A.length;i++){
            sum += A[i];
        }
        int min = Integer.MAX_VALUE;
        int sum_temp=0;
        for(int j=0;j<A.length-1;j++){
            sum_temp += A[j];
            min = Math.min(min,Math.abs(sum_temp-(sum-sum_temp)));
        }
        return min;
    }
}