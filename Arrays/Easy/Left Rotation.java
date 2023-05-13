// Left Rotation

[Question Link ](https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true) 

// Neen eae ee ee ee eee oe eR a UE Ue Ad

// TEU ae sue con
// Example

// d=2

// arr = (1,2,3, 4,5]

// After 2 rotations, arr’ = [3, 4,5, 1, 2].



    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        
        if(d > arr.size()) d = d % arr.size();
        
        if(d==0 || d==arr.size()) return arr;
        
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=d; i<arr.size(); i++){
            ans.add(arr.get(i));
        }
        for(int i=0; i<d; i++){
            ans.add(arr.get(i));
        }
        
        return ans;
        
    }