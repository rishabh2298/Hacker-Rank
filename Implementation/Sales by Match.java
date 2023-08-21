
/*
 *  Sales by Match
 * 
 *  Link : https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true 
 */

import java.util.*;
 
class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int N, List<Integer> arr) {
    // Write your code here
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<N; i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            }
            else{
                map.put(arr.get(i), 1);
            }
        }
        
        int ans = 0;
        
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() >= 2){
                ans += m.getValue()/2;
            }
        }
        
        return ans;
    }

}
