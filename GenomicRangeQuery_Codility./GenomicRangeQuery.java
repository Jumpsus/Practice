//My #008.1 Practice GenomicRangeQuery By: Peerapat R.

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int Ans[]= new int [P.length];
        char C[]= S.toCharArray();
        for(int i=0;i<P.length;i++){
            Ans[i]=4;
            for(int j=P[i];j<=Q[i];j++){
                if(C[j]=='G' & Ans[i] > 3)  Ans[i] = 3;
                else if(C[j]=='C' & Ans[i] > 2)  Ans[i] = 2;
                else if(C[j]=='A' & Ans[i] > 1){  
                    Ans[i] = 1; break;
                }
            } 
        }
        return Ans;
    }
}