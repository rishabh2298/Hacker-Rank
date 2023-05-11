// Given a6 x 6 2D Array, a1

// 111000
// 010000
// 111000
// 000000
// 000000
// 000000

// An hourglass in A is a subset of values with indices falling in this pattern in

// a b c
//   d
// e f g

// Ques link : https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true


    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    
            int N = arr.size();
            int M = arr.get(0).size();
    
            int[][] ans = new int[N-2][M-2];
            
            for(int i=0; i<N-2; i++){
                
                for(int j=0; j<M-2; j++){
                    
                    int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) 
                            + arr.get(i+1).get(j+1) 
                            + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                            
                    ans[i][j] = sum;
                    
                }
            }
            
            int index1 = -1;
            int index2 = -1;
            int elem = Integer.MIN_VALUE;
            
            for(int i=0; i<ans.length; i++){
                for(int j=0; j<ans[i].length; j++){
                    if(elem < ans[i][j]){
                        elem = ans[i][j];
                        index1 = i;
                        index2 = j;
                    }
                }
            }
            
            return elem;
            
    }

}