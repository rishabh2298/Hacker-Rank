/*
 * Subarray Division
 * =================
 
 *  Lily decides to share a contiguous segment of the bar selected such that:

    The length of the segment matches Ron's birth month, and,
    The sum of the integers on the squares is equal to his birth day.
    Determine how many ways she can divide the chocolate. 

    Link : https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true
 
 */

 
 
class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> arr, int d, int m) {
    // Write your code here
        
        int counter = 0;
        int sum = 0;
        
        for(int i=0; i<m; i++){
            sum += arr.get(i);
        }
        
        if(sum == d) counter++;
        
        for(int i=m; i<arr.size(); i++){
            sum -= arr.get(i-m);
            sum += arr.get(i);
            
            if(sum == d) counter++;
        }
        
        return counter;
    }

}
