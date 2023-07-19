
// Given a time in -hour AM/PM format, convert it to military (24-hour) time.

// Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
// - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

// Example

// s = '12:01:00PM'
// Return '12:01:00'.

// s = '12:01:00AM'
// Return '00:01:00'.

public class TimeConversion {
    
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
            
            String[] str = s.trim().split(":");
            
            StringBuilder ans = new StringBuilder();
            
            for(int i=0; i<str.length; i++){
                // AM
                if(str[2].charAt(2) == 'A'){
                    if(i==0){
                        if(Integer.parseInt(str[i]) == 12){
                            ans.append("00:");
                        }
                        else{
                            ans.append(str[i]+":");
                        }
                    }
                    else if(i==1){
                        ans.append(str[i]+":");
                    }
                    else{
                        ans.append(str[i].charAt(0)+""+str[i].charAt(1));
                    }
                }
                // PM
                else{
                    if(i==0){
                        int hour = Integer.parseInt(str[i]);
                        if(hour == 12){
                            ans.append(hour+":");
                        }
                        else{
                            ans.append(12+hour + ":");
                        }
                    }
                    else if(i==1){
                        ans.append(str[i] + ":");
                    }
                    else{
                        ans.append(str[i].charAt(0)+""+str[i].charAt(1));
                    }
                }
            }
            
            return ans.toString();
        }
    
}
