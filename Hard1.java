/*

Hard 1

Return the max sliding window.
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
1 <= k <= nums.length

Example:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7


*/

import java.util.Scanner;
import java.util.Collections;
import java.util.*;

public class Hard1{
  public static void maxSlideWin(int [] arr, int n, int k){
    ArrayList<Integer> res = new ArrayList<>();
    int max=Integer.MIN_VALUE;

    // calculating the max element in the range of the Sliding window
    for(int i=0;i<n-k+1;i++){
      max=Integer.MIN_VALUE;
      for(int j=i;j<i+k;j++){
        if(arr[j]>max){
          max=arr[j];
        }
      }
      // storing the max element for each sliding window range in an ArrayList;
      res.add(max);
    }

    System.out.println("Output:");

    for(int i=0;i<res.size();i++){
      System.out.print(res.get(i)+" ");
    }
  }

  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int k = sc.nextInt();
    
    maxSlideWin(arr,n,k);

  }
}