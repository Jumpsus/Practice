//My #004 Practice FrogRiverOne By: Peerapat R.

class Solution {
    public int solution(int X, int[] A) {
        Boolean a []= new Boolean[X+1];
        int b []= new int[X+1];
        for(int i=0;i<b.length;i++){
            b[i]=Integer.MAX_VALUE;
            a[i]=false;
        }
        for(int i=0;i<A.length;i++){
            if(A[i]<=X & A[i]>0){
                a[A[i]]=true;
                b[A[i]]=Math.min(i,b[A[i]]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=1;i<b.length;i++){
            if(a[i]==false) return -1;
            max = Math.max(max,b[i]);
        }
        return max;
    }
}