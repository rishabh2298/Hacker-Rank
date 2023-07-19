// Staircase

// Sample Input/Output
//      #
//     ##
//    ###
//   ####
//  #####
// ######


class Staicase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int N) {
    // Write your code here
        
        for(int i=N-1; i>=0; i--){
            
            StringBuilder str = new StringBuilder();
            
            for(int j=0; j<N; j++){
                if(j<i){
                    str.append(" ");
                }
                else{
                    str.append("#");
                }
            }
            
            System.out.println(str.toString());
        }
        
    }

}