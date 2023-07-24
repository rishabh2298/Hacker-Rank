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

/*
5. Weather Observation Station 5

Query the two cities in STATION with the shortest and longest CITY names, as well as 
their respective lengths (i.e.: number of characters in the name). If there is more 
than one smallest or largest city, choose the one that comes first when ordered 
alphabetically.

 GOOD Ques

 Link : https://www.hackerrank.com/challenges/weather-observation-station-5/problem?isFullScreen=true
*/

SELECT city, length(city) AS len
FROM station
ORDER BY len asc, city
LIMIT 1;

SELECT city, length(city) AS len
FROM station
ORDER BY len desc, city desc
LIMIT 1;


/*
 6. Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) 
    from STATION. 
    Your result cannot contain duplicates.

    Link : https://www.hackerrank.com/challenges/weather-observation-station-6/problem?isFullScreen=true

*/

SELECT DISTINCT city
FROM station
WHERE LEFT(city,1) IN ('a','e','i','o','u');


/*
 7. Query the list of CITY names ending with vowels (a, e, i, o, u) 
 from STATION. 
 Your result cannot contain duplicates.

 Link : https://www.hackerrank.com/challenges/weather-observation-station-7/problem?isFullScreen=true

*/

SELECT DISTINCT city
FROM station
where RIGHT(city,1) IN ('a','e','i','o','u');

/*
 8. Weather Observation Station 8

    Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) 
    as both their first and last characters. 
    Your result cannot contain duplicates.

    Link : https://www.hackerrank.com/challenges/weather-observation-station-8/problem?isFullScreen=true
*/

SELECT DISTINCT city
FROM station
WHERE LEFT(city,1) IN ('a','e','i','o','u') AND RIGHT(city,1) IN ('a','e','i','o','u');


/*
 9. Weather Observation Station 9

    Query the list of CITY names from STATION that do not start with vowels. 
    Your result cannot contain duplicates.

    Link : https://www.hackerrank.com/challenges/weather-observation-station-9/problem?isFullScreen=true
*/

SELECT DISTINCT city
FROM station
where LEFT(city,1) NOT IN ('a','e','i','o','u');


/*
 10. Query the list of CITY names from STATION that do not end with vowels. 
     Your result cannot contain duplicates.

    Link : https://www.hackerrank.com/challenges/weather-observation-station-10/problem?isFullScreen=true

*/

SELECT DISTINCT city
FROM station
WHERE RIGHT(city,1) NOT IN ('a','e','i','o','u');


/*
 11. Weather Observation Station 11

     Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. 
     Your result cannot contain duplicates.

    Link : https://www.hackerrank.com/challenges/weather-observation-station-11/problem?isFullScreen=true
*/

SELECT DISTINCT city
FROM station
WHERE LEFT(city,1) NOT IN ('a','e','i','o','u') OR RIGHT(city,1) NOT IN ('a','e','i','o','u');