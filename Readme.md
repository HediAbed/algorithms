# Algorithms
You will attached my solutions to test algorithm in  **Java**

## Algo 1

> You are given N counters, initially set to 0, and you have two possible operations on them:
- increase(X) − counter X is increased by 1,
- max counter − all counters are set to the maximum value of any counter.
> A non-empty array A of M integers is given. This array represents consecutive operations: 
-  if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X), max counter − all counters are set to the maximum value of any counter.
-  if A[K] = N + 1 then operation K is max counter.
> For example, given integer N = 5 and array A such that:
- A[0] = 3  A[1] = 4 A[2] = 4 A[3] = 6 A[4] = 1 A[5] = 4 A[6] = 4
> the values of the counters after each consecutive operation will be:
- (0, 0, 1, 0, 0)
- (0, 0, 1, 1, 0)
- (0, 0, 1, 2, 0)
- (2, 2, 2, 2, 2)
- (3, 2, 2, 2, 2)
- (3, 2, 2, 3, 2)
- (3, 2, 2, 4, 2)
> The goal is to calculate the value of every counter after all operations.
Write a function:
```java
class Solution { public int[] solution(int N, int[] A); }
```
>hat, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
>Result array should be returned as an array of integers. for example given : 
- A[0] = 3  A[1] = 4 A[2] = 4 A[3] = 6 A[4] = 1 A[5] = 4 A[6] = 4
> the function should return [3, 2, 2, 4, 2], as explained above.

**Write an efficient algorithm for the following assumptions**:
- N and M are integers within the range [1..100,000];
- each element of array A is an integer within the range [1..N + 1].


## Algo2 
> You have to climb up a ladder. The ladder has exactly N rungs, numbered from 1 to N. With each step, you can ascend by one or two rungs. More precisely:
- with your first step you can stand on rung 1 or 2
- if you are on rung K, you can move to rungs K + 1 or K + 2,
- finally you have to stand on rung N.
> your task is to count the number of different ways of climbing to the top of the ladder
> For example, given N = 4, you have five different ways of climbing, ascending by:
- 1, 1, 1 and 1 rung,
- 1, 1 and 2 rungs,
- 1, 2 and 1 rung,
- 2, 1 and 1 rungs, and
- 2 and 2 rungs.
> Given N = 5, you have eight different ways of climbing, ascending by:
- 1, 1, 1, 1 and 1 rung,
- 1, 1, 1 and 2 rungs,
- 1, 1, 2 and 1 rung,
- 1, 2, 1 and 1 rung,
- 1, 2 and 2 rungs,
- 2, 1, 1 and 1 rungs,
- 2, 1 and 2 rungs, and
- 2, 2 and 1 rung.
> The number of different ways can be very large, so it is sufficient to return the result modulo 2P, for a given integer P. Write a function:
```java
class Solution { public int[] solution(int[] A, int[] B); }
```
> that, given two non-empty arrays A and B of L integers, returns an array consisting of L integers specifying the consecutive answers; position I should contain the number of different ways of climbing the ladder with A[I] rungs modulo 2B[I].
> For example, given L = 5 and:
- A[0] = 4  B[0] = 3
- A[1] = 4  B[1] = 2
- A[2] = 5  B[2] = 4
- A[3] = 5  B[3] = 3
- A[4] = 1  B[4] = 1
> the function should return the sequence [5, 1, 8, 0, 1], as explained above

**Write an efficient algorithm for the following assumptions:**
- L is an integer within the range [1..50,000];
- each element of array A is an integer within the range [1..L];
- each element of array B is an integer within the range [1..30].
## Algo3

> For a given array A of N integers and a sequence S of N integers from the set {−1, 1}, we define val(A, S) as follows:

```shell
val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
```

>(Assume that the sum of zero elements equals zero.)

>For a given array A, we are looking for such a sequence S that minimizes val(A,S).
>Write a function:
```java
class Solution { public int solution(int[] A); }
```
> that, given an array A of N integers, computes the minimum value of val(A,S) from all possible values of val(A,S) for all possible sequences S of N integers from the set {−1, 1}.
> For example, given array:

- A[0] = 1 A[1] = 5 A[2] = 2 A[3] = -2

> your function should return 0, since for S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.

**Write an efficient algorithm for the following assumptions :**

- N is an integer within the range [0..20,000];
 - each element of array A is an integer within the range [−100..10