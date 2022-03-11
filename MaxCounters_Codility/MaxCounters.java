//My #005.1 Practice MaxCounters By: Peerapat R.

class Solution {
    public int[] solution(int N, int[] A) {
        int max = 0;
        int max_temp = 0;
        int D[]= new int[N];
        for(int i=0;i<A.length;i++){
            if(A[i]>N){
                if(max_temp != 0){
                max=max+max_temp;
                max_temp=0;
                D = new int[N];
                }
            }else {
                D[A[i]-1]++;
                max_temp=Math.max(D[A[i]-1],max_temp);
            }
        }
        if(max!=0) for(int i=0;i<D.length;i++) D[i]+=max;
        return D;
    }
}