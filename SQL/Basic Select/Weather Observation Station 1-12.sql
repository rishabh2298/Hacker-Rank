-- 1
-- Query a list of CITY and STATE from the STATION table.
-- The STATION table is described as follows:

-- Link : https://www.hackerrank.com/challenges/weather-observation-station-1/problem?isFullScreen=true

SELECT city,state
FROM station;


/*  
3.  Query a list of CITY names from STATION for cities that have an even ID number. 
    Print the results in any order, but exclude duplicates from the answer.

Link : https://www.hackerrank.com/challenges/weather-observation-station-3/problem?isFullScreen=true
*/

SELECT DISTINCT city
FROM station
WHERE id%2=0;


/*
4.  Find the difference between the total number of CITY entries in the table and the number 
    of distinct CITY entries in the table.The STATION table is described as follows:

Link : https://www.hackerrank.com/challenges/weather-observation-station-4/problem?isFullScreen=true
*/

SELECT count(city)-count(DISTINCT city)
FROM station;