
// You are in charge of the cake for a child's birthday. You have decided the cake will 
// have one candle for each year of their total age. They will only be able to blow out 
// the tallest of the candles. Count how many candles are tallest.

// Sample Input            Sample Output
// [4,4,1,3]               2

public class BirthdayCakeCandles {
    
    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
            
            int maxNumber = -1;
            int count = 0;
            
            for(int i=0; i<candles.size(); i++){
                if(candles.get(i) > maxNumber){
                    maxNumber = candles.get(i);
                    count = 1;
                }
                else if(candles.get(i) == maxNumber){
                    count++;
                }
            }
            
            return count;
        }
    
}
