/*
 * 
 *  There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

    1.The elements of the first array are all factors of the integer being considered
    2.The integer being considered is a factor of all elements of the second array

    These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

    Link : https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
*/


class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        
        // it should be max of arr1
        int lower = Integer.MIN_VALUE;
        
        // it should be min of arr2
        int upper = Integer.MAX_VALUE;
        
        
        for(int i=0; i<a.size(); i++){
            lower = Math.max(lower,a.get(i));
        }
        
        for(int i=0; i<b.size(); i++){
            upper = Math.min(upper,b.get(i));
        }
        
        
        int counter = 0;
        
        for(int i=lower; i<=upper; i++){
            
            int sumOfMod = 0;
            
            for(int j=0; j<a.size(); j++){
                sumOfMod += i % a.get(j);
            }
            
            for(int j=0; j<b.size(); j++){
                sumOfMod += b.get(j) % i;
            }
            
            if(sumOfMod == 0) counter++;
        }
        
        return counter;
    }

}