//My #006 Practice MissingInteger By: Peerapat R.

import java.util.Arrays; 

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int Ans=1;
        for(int i=0;i<A.length;i++){
            if(A[i]==Ans) Ans++;
        }
        return Ans;
    }
}