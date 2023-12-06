/* 

Medium 2

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

*/

import java.util.Scanner;
import java.util.Collections;
import java.util.*;

public class Medium2{
  public static int[] times(int[] num, int n){

    // hashmap to store the count of each element in the array
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<n;i++){
      if(map.containsKey(num[i])){
        map.put(num[i],map.get(num[i])+1);
      }
      else{
        map.put(num[i],1);
      }
    }

    // to get all the elements with count greater than n/3 into a new array
    int[] ans = new int[n];
    int k=0;
    for(Map.Entry<Integer,Integer> e : map.entrySet()){
      if(e.getValue() > n/3){
        ans[k++]=e.getKey();
      }
    }

    return ans;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // inputing the size of the array
    int n = sc.nextInt();

    // inputting the elements of the array
    int[] num = new int[n];
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }

    // calling the times function to perform the necessary action
    int[] ans = times(num,n);

    // printing the elements with the count greater than n/3
    for(int i=0;i<ans.length;i++){
      if(ans[i]!=0){
        System.out.println(ans[i]);
      }
    }

  }
}