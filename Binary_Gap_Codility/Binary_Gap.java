//My #001 Practice Binary_Gap By: Peerapat R.
class Solution {
    public int solution(int N) {
        if(N>2147483647||N<0){
            return -1;
        }
        String J = Integer.toBinaryString(N);
        char [] U = J.toCharArray();
        int M = 0;
        int P = 0;
        for(int i =0; i<U.length ; i++){
            if(U[i] == '0'){
                P++;
            }else if(U[i] == '1'){
                M = Math.max(M,P);
                P = 0;
            }else{
               return -1; 
            }
        }
        return M;   // write your code in Java SE 8
    }
}
