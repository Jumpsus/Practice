//My #007 Practice PassingCars By: Peerapat R.

class Solution {
    public int solution(int[] A) {
        int count_1 = 0;
        int pass = 0;
        for(int i =0;i<A.length;i++){
            count_1 += A[i];
        }
        for(int i =0;i<A.length;i++){
            if(A[i]==0){
                pass += count_1;
                if(pass>1000000000) return -1;
            }else{
                count_1--;
                if(count_1 ==0) break;
            }
        }
        return pass;
    }
}
