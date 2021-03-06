Problem Statement:-

    You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence, 
    i.e., you need to find the sum of the maximum sum path to reach from beginning of any array to end 
    of any of the two arrays. 

    You can switch from one array to another array only at common elements.


Input Format:-

    First line contains integer T which is number of test case. 
    For each test case, 
        It contains two integers Size1 and Size2 which is the size of arrays 
        Next two lines contains Size1 and Size2 space separated integers respectively.

    
Output Format:-

    Print the sum of maximum path.


<br /><br /><br /><br /><br />
Example:
<br /><br />
Input:-

    1
    8 8
    1 4 6 10 12 13 32 36
    1 5 6 8 10 15 16 17


Output:-

    123


Explaination:-

        Sum of path ( 1, 5, 6, 8, 10, 12, 13, 32, 36) is 123.