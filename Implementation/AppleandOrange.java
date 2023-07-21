
// Link : https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

public class AppleandOrange {
    
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
            
            int apl = 0;
            int org = 0;
            
            for(int i=0; i<apples.size(); i++){
                int isValid = a + apples.get(i);
                if(isValid>=s && isValid<=t){
                    apl++;
                }
            }
            
            // IN Oranges
            // -ve will act as +ve and vice,versa
            
            for(int i=0; i<oranges.size(); i++){
                int value = -(oranges.get(i));
                int isValid = b - value;
                if(isValid>=s && isValid<=t){
                    org++;
                }
            }
            
            System.out.println(apl);
            System.out.println(org);
        }
    
}
