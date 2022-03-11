//My #003 Practice PermCheck By: Peerapat R.
import java.util.Arrays; 

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        if(A[0] != 1) return 0;
        
        for(int i=1;i<A.length;i++){
            if(A[i] != A[i-1]+1) return 0;
        }
        return 1;
    }
}
