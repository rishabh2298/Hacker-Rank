/*
 *  Divisible Sum Pairs
 * 
 *  Link : https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
 * 
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
    // Write your code here
        
        int counter = 0;
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if((arr.get(i) + arr.get(j) ) % k == 0) counter++;
            }
        }
        
        return counter;
    }

}