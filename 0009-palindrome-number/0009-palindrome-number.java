class Solution {
    public boolean isPalindrome(int x) 
    {
        int sum=0;
        int n1=x;
         if (x < 0) {
            return false;
        }
        while(x!=0)
        {
            int digit=x%10;
            sum=sum*10+digit;
            x/=10;
        }
        return n1==sum;
    }
}