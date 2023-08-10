/*
 * Link : https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
 * 
 *  Sample Input 1
    10
    3 4 21 36 10 28 35 5 24 42
    
    Sample Output 1
    4 0
 *  (max min)
 */

 
class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        
        List<Integer> ans = new ArrayList<>();
        
        int min = -1;
        int max = -1;
        
        int min_so_far = Integer.MAX_VALUE;
        int max_so_far = Integer.MIN_VALUE;
        
        for(int i=0; i<scores.size(); i++){
            if(min_so_far > scores.get(i)){
                min_so_far = scores.get(i);
                min++;
            }
            if(max_so_far < scores.get(i)){
                max_so_far = scores.get(i);
                max++;
            }
        }
        
        return Arrays.asList(max,min);
    }

}