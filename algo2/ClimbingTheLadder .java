class ClimbingTheLadder  {
    public static int[] solution(int[] A, int[] B) {
       
        int L = A.length;
        int[] fib = new int[L+2];
        int[] result = new int[L];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= L+1; i++) {
            
            fib[i] = (fib[i-1] + fib[i-2]) % (1 << 30);
        }
        for (int i = 0; i < L; i++) {
            result[i] = fib[A[i]+1] % (1 << B[i]);
        }
        return result;
    }
}
