Problem
You are provided an array A of size N that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by 10.

Note: View the sample explanation section for more clarification.

Input format

First line: A single integer N  denoting the size of array 
Second line: N space-separated integers.
Output format

If the number is divisible by 10, then print YES. Otherwise, print No.


Sample Input:---
5
85 25 65 21 84


Sample outPut:--
No


Explanation
Last digit of 85 is 5.
Last digit of 25 is 5.
Last digit of 65 is 5.
Last digit of 21 is 1.
Last digit of 84 is 4.
Therefore the number formed is 55514 which is not divisible by 10.
  
  
  Solution:----
    /* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }

        
        // Write your code here
        // ans = 
        String ans;
        if(data[N-1] %10 ==0)
        {
            ans = "Yes";
        }else ans="No";
        
        
        System.out.println(ans);
        //return 0;
    }
}
