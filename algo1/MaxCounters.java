class MaxCounters{
    public static int[] maxCounters(int N, int[] A) {
        int [] ouput = new int[N];
        int max =0, min=0;
        for (int i=0;i<A.length;i++){
            if (A[i]<=N){
                if (ouput[A[i]-1]<min)
                   ouput[A[i]-1]=min;
                ouput[A[i]-1]+=1;
                if (ouput[A[i]-1]>max)
                   max=ouput[A[i]-1];
            }else {
               min=max;
            }
        }
       for (int i=0;i<N;i++){
            if ( ouput[i]<min)
               ouput[i]=min;
        }
        return ouput;
    }
    public static int [] count(int [] ouput,int i, int min,int N){
        if (i == N) return ouput;
        else{
            if ( ouput[i]<min)
            ouput[i]=min;
            return count(ouput,i+1,min,N);
        }
   }
}