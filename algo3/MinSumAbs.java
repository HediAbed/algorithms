import java.util.Arrays;
​
public class MinSumAbs {
    public static int solution(int[] A){
        int length = A.length;
        if (length == 0) return 0;
        if (length == 1) return A[0];
        for (int i = 0; i < length; i++) { A[i] = Math.abs(A[i]); }
        Arrays.sort(A);
        // 1) ascendant and descendant sum
        int ascendantSum =A[0],ascendantSum2=A[0];
        for (int i = 1; i < length; i++){
            if (ascendantSum< A[i])
                ascendantSum=ascendantSum+A[i];
            else
                ascendantSum=ascendantSum-A[i];
​
            if (ascendantSum2< A[i])
                ascendantSum2=-ascendantSum2+A[i];
            else
                ascendantSum2=ascendantSum2-A[i];
        }
        ascendantSum=Math.min(ascendantSum,ascendantSum2);
​
        int descendantSum=A[length-1],descendantSum2=A[length-1];
        for (int i = length-2; i >= 0; i--){
            if (descendantSum> A[i])
                descendantSum=descendantSum-A[i];
            else
                descendantSum=descendantSum+A[i];
​
            if (descendantSum2> A[i])
                descendantSum2=descendantSum2-A[i];
            else
                descendantSum2=-descendantSum2+A[i];
        }
        descendantSum=Math.min(descendantSum,descendantSum2);
        // 2) jum index sum
        int jumpSumPart1=A[length-1];
        for (int i = length-3; i >= 0; i-=2){
            jumpSumPart1=jumpSumPart1-A[i];
        }
        int jumpSumPart2=A[length-2];
        for (int i = length-4; i >= 0; i-=2){
            jumpSumPart2=jumpSumPart2-A[i];
        }
        int jumpSum=Math.abs(jumpSumPart2+jumpSumPart1);
        // 3) scale window sum
        int scaleWindowSum=A[0];
        if (length % 2==0)
            scaleWindowSum=0;
        for (int i = length-1; i > 0; i-=2){
            if ((A[i]-A[i-1])>scaleWindowSum)
                scaleWindowSum=(A[i]-A[i-1])+scaleWindowSum;
            else
                scaleWindowSum=(A[i]-A[i-1])-scaleWindowSum;
        }
        scaleWindowSum=Math.abs(scaleWindowSum);
        // 4) mirror sum
        int mirrorSum=0;
        int midNb=0;
        int i=0,j= length-1;
        if (length % 2!=0) {
            midNb = A[length / 2];
            while (i != length / 2 && j != length / 2) {
                mirrorSum = mirrorSum + A[j] - A[i];
                --j;
                ++i;
            }
        }else {
            while (i < j ) {
                mirrorSum = mirrorSum - (A[j] - A[i]);
                mirrorSum = Math.abs(mirrorSum);
                --j;
                ++i;
            }
        }
        mirrorSum=Math.abs(midNb-mirrorSum);
        return Math.min(Math.min( Math.min(Math.min(ascendantSum, descendantSum), jumpSum),scaleWindowSum),mirrorSum);
    }
}




