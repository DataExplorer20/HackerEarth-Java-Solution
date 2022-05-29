Problem
You are required to enter a word that consists of x and y that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if  2*x=y.

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be 20.
Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No.

Sample Input
zzzoooooo
Sample Output
Yes





import java.util.*;


class TestClass {
    public static void main(String args[] ) {
       
     
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='z')
            {
                flag++;
            }
        }
        if(2*flag == str.length()-flag)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
