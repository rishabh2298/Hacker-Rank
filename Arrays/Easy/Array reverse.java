Reverse Array

Example
A = [1,2,3]
Return [3,2, ,1].



class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> arr) {
    // Write your code here
    
        List<Integer> list = new ArrayList<>();
        
        int i=arr.size()-1; 
        
        while(i>=0){
            list.add(arr.get(i));
            i--;
        }
        
        return list;
    }

}
