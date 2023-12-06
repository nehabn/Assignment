/* 

EASY 1

Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only. 

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

*/

import java.util.Scanner;

public class Easy1{
  public static int getLastLen(String s){
    
    // Removing spaces from the start and end of the string using trim()
    String s2 = s.trim();

    // Counting length of last word using for loop until a space encountered.
    int len=0;
    for(int i=s2.length()-1;i>=0;i--){
      if(s2.charAt(i)==' '){
        break;
      }
      len++;
    }
    return len;
  }

  public static void main(String args[]){
    // System.out.println("Hello world");
    Scanner sc= new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(getLastLen(s));
    
  }
}