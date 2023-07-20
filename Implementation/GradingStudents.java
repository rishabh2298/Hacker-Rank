// Grading Students

// Link : https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

import java.util.*;
import java.io.*;

public class GradingStudents {
    
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
     
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        
            List<Integer> list = new ArrayList<>();
            
            for(int i=0; i<grades.size(); i++){
                if(grades.get(i) < 40){
                    if(40-grades.get(i) < 3){
                        list.add(40);
                    }
                    else{
                        list.add(grades.get(i));
                    }
                }
                else{
                    if(grades.get(i)%5 > 2){
                        list.add(grades.get(i) + 5-grades.get(i)%5);
                    }
                    else{
                        list.add(grades.get(i));
                    }
                }
            }
            
            return list;
        }
    
}
