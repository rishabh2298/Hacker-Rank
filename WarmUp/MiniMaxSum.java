//   Min Max Sum

// Given five positive integers, find the minimum and maximum values that can be calculated 
// by summing exactly four of the five integers. Then print the respective minimum and maximum 
// values as a single line of two space-separated long integers.

// Link : https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true


public class MiniMaxSum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
            
            long min,max,sum;
            
            min = max = sum = arr.get(0);
            
            for(int i=1; i<arr.size(); i++){
                
                if(min > arr.get(i)) min = arr.get(i);
                if(max < arr.get(i)) max = arr.get(i);
                
                sum += arr.get(i);
            }
            
            //                 min sum +" "+ max sum
            System.out.println((sum-max)+" "+(sum-min));
        }
    
}
