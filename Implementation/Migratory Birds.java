/*
    Given an array of bird sightings where every element represents a bird type id, 
    determine the id of the most frequently sighted type. If more than 1 type has been 
    spotted that maximum amount, return the smallest of their ids.
 * 
 *  Link : https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
 * 
 */


 
class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.size(); i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
            else{
                map.put(arr.get(i),1);
            }
        }
        
        int value = 0;
        int key = 0;
        
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() > value){
                value = m.getValue();
                key = m.getKey();
            }
        }
        
        return key;
    }

}
